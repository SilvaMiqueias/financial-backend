package com.example.financial.model.enumerador;

import lombok.Getter;

@Getter
public enum CategoryEnum {

    FOOD("Alimentação"),
    HEALTH("Saúde"),
    TRANSPORT("Transporte"),
    EDUCATION("Educação"),
    ENTERTAINMENT("Entretenimento"),
    HOUSING("Habitação"),
    SALARY("Salário"),
    INVESTMENT("Investimento"),
    TAXES("Impostos"),
    UTILITIES("Utilidades"),
    OTHER("Outros");

    private final String description;

    CategoryEnum(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
