package com.epam.prep.pattern.Function;

public class TransactionDTO {
    private String id;
    private Double amount;

    public TransactionDTO(String id, Double amount) {
        this.id = id;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TransactionDTO{id=" + id +
                ", amount=" + amount + "}";
    }
}
