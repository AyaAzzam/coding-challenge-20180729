package coding.challenge.energyconsumption.repository;

import coding.challenge.energyconsumption.model.CounterReading;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CounterReadingRepository extends CrudRepository<CounterReading, Long> {

    @Query(value="select c from CounterReading c where c.readingAt > :fromDate and  c.readingAt < :toDate")
    List<CounterReading> getByDuration(@Param("fromDate") LocalDateTime fromDate, @Param("toDate") LocalDateTime toDate);
}
