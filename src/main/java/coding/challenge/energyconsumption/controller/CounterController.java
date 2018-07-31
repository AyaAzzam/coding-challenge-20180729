package coding.challenge.energyconsumption.controller;

import coding.challenge.energyconsumption.dto.CounterDTO;
import coding.challenge.energyconsumption.mapper.CounterMapper;
import coding.challenge.energyconsumption.model.Counter;
import coding.challenge.energyconsumption.service.CounterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
public class CounterController {

    private CounterService counterService;

    public CounterController(CounterService counterService) {
        this.counterService = counterService;
    }

    @GetMapping(path = "/api/counter/{counter-id}")
    public ResponseEntity<?> getCounter(@PathVariable(value = "counter-id") Long counterId) {
        Optional<Counter> counter = counterService.getById(counterId);
        if (!counter.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(counter);
    }


    @PostMapping(path = "/api/counter")
    public ResponseEntity<?> saveCounter(@RequestBody @Valid CounterDTO counterDTO) {
        return  ResponseEntity.ok(counterService.save(CounterMapper.toCounter(counterDTO)));
    }


    // Put API for updating counters

    // Delete API fo removing counters

}
