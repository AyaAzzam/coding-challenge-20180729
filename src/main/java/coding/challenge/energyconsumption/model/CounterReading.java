package coding.challenge.energyconsumption.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "counter_reading")
public class CounterReading implements Serializable {

    private static final long serialVersionUID = 435947909928592123L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "counter_id", referencedColumnName = "id")
    private Counter counter;

    @Column(name = "reading_at")
    private LocalDateTime readingAt;

    private Double amount;

    public CounterReading() {
    }

    public CounterReading(Counter counter, LocalDateTime readingAt, Double amount) {
        this.counter = counter;
        this.readingAt = readingAt;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Counter getCounter() {
        return counter;
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
    }

    public LocalDateTime getReadingAt() {
        return readingAt;
    }

    public void setReadingAt(LocalDateTime readingAt) {
        this.readingAt = readingAt;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CounterReading that = (CounterReading) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
