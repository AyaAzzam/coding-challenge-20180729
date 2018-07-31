package coding.challenge.energyconsumption.controller;

import coding.challenge.energyconsumption.service.CounterReadingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumptionReportController {

    private static final String DEFAULT_DURATION = "24h";

    private CounterReadingService counterReadingService;

    public ConsumptionReportController(CounterReadingService counterReadingService) {
        this.counterReadingService = counterReadingService;
    }

    @GetMapping(path = "/api/consumption-report")
    public ResponseEntity<?> getConsumptionReport(@RequestParam(value = "duration",
            defaultValue = DEFAULT_DURATION) String duration) {
        return ResponseEntity.ok(counterReadingService.getConsumptionReportDTOByDuration(duration));
    }
}
