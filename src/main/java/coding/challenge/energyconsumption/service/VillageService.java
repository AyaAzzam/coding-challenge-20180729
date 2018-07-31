package coding.challenge.energyconsumption.service;

import coding.challenge.energyconsumption.model.Village;

import java.util.Optional;

public interface VillageService {

    public Village save(Village village);

    public Optional<Village> getById(Long id);
}
