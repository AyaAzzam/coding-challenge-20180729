package coding.challenge.energyconsumption.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "village")
public class Village implements Serializable {

    private static final long serialVersionUID = 8527695980909864257L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max=255)
    private String name;

    public Village() {
    }

    public Village(String name) {
        this.name = name;
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Village village = (Village) o;
        return Objects.equals(id, village.id) &&
                Objects.equals(name, village.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }
}
