package coding.challenge.energyconsumption.service.impl;

import coding.challenge.energyconsumption.dto.ConsumptionReportDTO;
import coding.challenge.energyconsumption.dto.VillageConsumptionDTO;
import coding.challenge.energyconsumption.model.Counter;
import coding.challenge.energyconsumption.model.CounterReading;
import coding.challenge.energyconsumption.repository.CounterReadingRepository;
import coding.challenge.energyconsumption.service.CounterReadingService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class CounterReadingServiceImpl implements CounterReadingService {

    private static final Pattern DURATION_PATTERN = Pattern.compile("\\d+[h]");

    private CounterReadingRepository counterReadingRepository;

    public CounterReadingServiceImpl(CounterReadingRepository counterReadingRepository) {
        this.counterReadingRepository = counterReadingRepository;
    }

    @Override
    public CounterReading save(CounterReading counterReading) {
        return counterReadingRepository.save(counterReading);
    }

    @Override
    public List<CounterReading> getByDuration(String duration) {
        Integer numOfHours = getNumOfHours(duration);
        return counterReadingRepository.getByDuration(LocalDateTime.now().plusHours(-numOfHours), LocalDateTime.now());
    }

    @Override
    public ConsumptionReportDTO getConsumptionReportDTOByDuration(String duration) {

        List<CounterReading> counterReadings = getByDuration(duration);
        List<VillageConsumptionDTO> villages = getConsumptionReportDTO(counterReadings);

        return new ConsumptionReportDTO(villages);
    }


    private List<VillageConsumptionDTO> getConsumptionReportDTO(List<CounterReading> counterReadings) {
        Map<Counter, Double> counterReadingMap = new HashMap<>();

        for (CounterReading reading : counterReadings) {
            if (!counterReadingMap.containsKey(reading.getCounter())) {
                counterReadingMap.put(reading.getCounter(), reading.getAmount());
            } else {
                counterReadingMap.put(reading.getCounter(), reading.getAmount() + counterReadingMap.get(reading.getCounter()));
            }
        }

        List<VillageConsumptionDTO> villages = new ArrayList<>();

        for (Map.Entry<Counter, Double> entry : counterReadingMap.entrySet()) {
            villages.add(new VillageConsumptionDTO(entry.getKey().getVillage().getName(), entry.getValue()));
        }
        return villages;
    }


    private Integer getNumOfHours(String duration) {
        Integer noOfHours = 0;
        Matcher match = DURATION_PATTERN.matcher(duration);
        if(match.find()) {
            String group = match.group();
            String substring = group.substring(0, group.length() - 1);
            noOfHours = Integer.valueOf(substring);
        }
        return noOfHours;
    }
}
