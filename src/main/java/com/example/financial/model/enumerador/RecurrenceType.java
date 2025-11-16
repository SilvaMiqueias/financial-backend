package com.example.financial.model.enumerador;

import lombok.Getter;

@Getter
public enum RecurrenceType {

    WEEKLY("Semanal"),
    MONTHLY("Mensal"),
    YEARLY("Anual");

    private final String description;

    RecurrenceType(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
