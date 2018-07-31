package coding.challenge.energyconsumption.service;

import coding.challenge.energyconsumption.model.Counter;

import java.util.Optional;

public interface CounterService {

    public Counter save(Counter counter);

    public Optional<Counter> getById(Long id);

}
