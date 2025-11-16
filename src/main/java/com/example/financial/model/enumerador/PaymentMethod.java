package com.example.financial.model.enumerador;

import lombok.Getter;

@Getter
public enum PaymentMethod {

    CASH("Dinheiro"),
    DEBIT_CARD("Cartão de Débito"),
    CREDIT_CARD("Cartão de Crédito"),
    PIX("Pix"),
    BANK_TRANSFER("Transferência Bancária"),
    BOLETO("Boleto"),
    DIGITAL_WALLET("Carteira Digital"),
    OTHER("Outro");

    private final String description;

    PaymentMethod(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
