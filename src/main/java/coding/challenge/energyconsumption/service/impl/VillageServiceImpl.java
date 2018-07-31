package coding.challenge.energyconsumption.service.impl;

import coding.challenge.energyconsumption.model.Village;
import coding.challenge.energyconsumption.repository.VillageRepository;
import coding.challenge.energyconsumption.service.VillageService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VillageServiceImpl implements VillageService {

    private VillageRepository villageRepository;

    public VillageServiceImpl(VillageRepository villageRepository) {
        this.villageRepository = villageRepository;
    }

    @Override
    public Village save(Village village) {
        return villageRepository.save(village);
    }

    @Override
    public Optional<Village> getById(Long id) {
        return villageRepository.findById(id);
    }
}
