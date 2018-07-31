package coding.challenge.energyconsumption.dto;

import java.io.Serializable;
import java.util.List;

public class ConsumptionReportDTO implements Serializable {

    private static final long serialVersionUID = -3562900106887436552L;

    private List<VillageConsumptionDTO> villages;

    public ConsumptionReportDTO() {
    }

    public ConsumptionReportDTO(List<VillageConsumptionDTO> villages) {
        this.villages = villages;
    }

    public List<VillageConsumptionDTO> getVillages() {
        return villages;
    }

    public void setVillages(List<VillageConsumptionDTO> villages) {
        this.villages = villages;
    }
}
