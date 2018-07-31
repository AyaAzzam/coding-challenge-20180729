package coding.challenge.energyconsumption.dto;

import java.io.Serializable;

public class VillageDTO implements Serializable {

    private static final long serialVersionUID = 3559593130334527958L;

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "VillageDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
