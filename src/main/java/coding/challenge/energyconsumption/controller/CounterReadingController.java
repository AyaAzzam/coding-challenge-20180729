package coding.challenge.energyconsumption.controller;

import coding.challenge.energyconsumption.dto.CounterReadingDTO;
import coding.challenge.energyconsumption.mapper.CounterReadingMapper;
import coding.challenge.energyconsumption.service.CounterReadingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CounterReadingController {

    private CounterReadingService counterReadingService;
    private CounterReadingMapper counterReadingMapper;

    public CounterReadingController(CounterReadingService counterReadingService, CounterReadingMapper counterReadingMapper) {
        this.counterReadingService = counterReadingService;
        this.counterReadingMapper = counterReadingMapper;
    }

    @PostMapping(path = "/api/counter-reading")
    public ResponseEntity<?> saveCounterReading(@RequestBody @Valid CounterReadingDTO counterReadingDTO) {
        return  ResponseEntity.ok(counterReadingService.save(counterReadingMapper.toCounterReading(counterReadingDTO)));
    }
}
