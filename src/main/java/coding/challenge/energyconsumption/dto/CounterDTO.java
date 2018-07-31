package coding.challenge.energyconsumption.dto;

import java.io.Serializable;

public class CounterDTO implements Serializable {

    private static final long serialVersionUID = 1775065656372835403L;

    private Long id;

    private VillageDTO village;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VillageDTO getVillage() {
        return village;
    }

    public void setVillage(VillageDTO village) {
        this.village = village;
    }

    @Override
    public String toString() {
        return "CounterDTO{" +
                "id=" + id +
                ", village=" + village +
                '}';
    }
}
