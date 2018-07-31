package coding.challenge.energyconsumption.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "counter")
public class Counter implements Serializable {

    private static final long serialVersionUID = 575347909928592140L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "village_id", referencedColumnName = "id")
    private Village village;

    public Counter() {
    }

    public Counter(Village village) {
        this.village = village;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Village getVillage() {
        return village;
    }

    public void setVillage(Village village) {
        this.village = village;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Counter counter = (Counter) o;
        return Objects.equals(id, counter.id) &&
                Objects.equals(village, counter.village);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, village);
    }
}
