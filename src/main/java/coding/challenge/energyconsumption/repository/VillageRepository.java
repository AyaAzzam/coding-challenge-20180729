package coding.challenge.energyconsumption.repository;

import coding.challenge.energyconsumption.model.Village;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VillageRepository extends CrudRepository<Village, Long> {
}
