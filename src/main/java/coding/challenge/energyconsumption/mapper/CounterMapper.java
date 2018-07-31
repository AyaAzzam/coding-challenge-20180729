package coding.challenge.energyconsumption.mapper;

import coding.challenge.energyconsumption.dto.CounterDTO;
import coding.challenge.energyconsumption.model.Counter;

public class CounterMapper {

    public static Counter toCounter(CounterDTO counterDTO) {
        return new Counter(VillageMapper.toVillage(counterDTO.getVillage()));
    }
}
