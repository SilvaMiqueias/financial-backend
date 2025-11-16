package com.example.financial.model.enumerador;

import lombok.Getter;

@Getter
public enum TransactionType {

    INCOME("Receita"),
    EXPENSE("Despesa");

    private final String description;

    TransactionType(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
