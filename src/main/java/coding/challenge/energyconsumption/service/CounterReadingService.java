package coding.challenge.energyconsumption.service;

import coding.challenge.energyconsumption.dto.ConsumptionReportDTO;
import coding.challenge.energyconsumption.model.CounterReading;

import java.util.List;

public interface CounterReadingService {

    public CounterReading save(CounterReading counterReading);

    public List<CounterReading> getByDuration(String duration);

    public ConsumptionReportDTO getConsumptionReportDTOByDuration(String duration);
}
