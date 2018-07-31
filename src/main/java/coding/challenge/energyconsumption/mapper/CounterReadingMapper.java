package coding.challenge.energyconsumption.mapper;

import coding.challenge.energyconsumption.dto.CounterReadingDTO;
import coding.challenge.energyconsumption.model.Counter;
import coding.challenge.energyconsumption.model.CounterReading;
import coding.challenge.energyconsumption.service.CounterService;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class CounterReadingMapper {

    private CounterService counterService;

    public CounterReadingMapper(CounterService counterService) {
        this.counterService = counterService;
    }

    public CounterReading toCounterReading(CounterReadingDTO counterReadingDTO) {
        Optional<Counter> counter = counterService.getById(counterReadingDTO.getCounterId());
        return counter.map(counter1 -> new CounterReading(counter1, LocalDateTime.now(), counterReadingDTO.getAmount())).orElseGet(CounterReading::new);
    }
}
