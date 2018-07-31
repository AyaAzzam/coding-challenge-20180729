package coding.challenge.energyconsumption.service.impl;

import coding.challenge.energyconsumption.model.Counter;
import coding.challenge.energyconsumption.repository.CounterRepository;
import coding.challenge.energyconsumption.service.CounterService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CounterServiceImpl implements CounterService {

    private CounterRepository counterRepository;

    public CounterServiceImpl(CounterRepository counterRepository) {
        this.counterRepository = counterRepository;
    }

    @Override
    public Counter save(Counter counter) {
        return counterRepository.save(counter);
    }

    @Override
    public Optional<Counter> getById(Long id) {
        return counterRepository.findById(id);
    }
}

