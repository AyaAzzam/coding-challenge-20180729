package coding.challenge.energyconsumption.mapper;

import coding.challenge.energyconsumption.dto.VillageDTO;
import coding.challenge.energyconsumption.model.Village;

public class VillageMapper {

    public static Village toVillage(VillageDTO villageDTO) {
        return new Village(villageDTO.getName());
    }
}

