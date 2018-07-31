package coding.challenge.energyconsumption.dto;

import java.io.Serializable;

public class CounterReadingDTO implements Serializable {

    private static final long serialVersionUID = -436287555442569520L;

    private Long counterId;

    private Double amount;

    public Long getCounterId() {
        return counterId;
    }

    public void setCounterId(Long counterId) {
        this.counterId = counterId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CounterReadingDTO{" +
                "counterId=" + counterId +
                ", amount=" + amount +
                '}';
    }
}
