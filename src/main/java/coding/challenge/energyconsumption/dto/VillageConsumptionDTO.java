package coding.challenge.energyconsumption.dto;

import java.io.Serializable;

public class VillageConsumptionDTO implements Serializable {

    private static final long serialVersionUID = -7780839135725513460L;

    private String villageName;

    private Double consumption;

    public VillageConsumptionDTO() {
    }

    public VillageConsumptionDTO(String villageName, Double consumption) {
        this.villageName = villageName;
        this.consumption = consumption;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public Double getConsumption() {
        return consumption;
    }

    public void setConsumption(Double consumption) {
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return "VillageConsumptionDTO{" +
                "villageName='" + villageName + '\'' +
                ", consumption=" + consumption +
                '}';
    }
}
