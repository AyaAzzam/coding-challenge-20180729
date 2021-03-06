package coding.challenge.energyconsumption.repository;

import coding.challenge.energyconsumption.model.Counter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CounterRepository extends CrudRepository<Counter, Long> {
}
