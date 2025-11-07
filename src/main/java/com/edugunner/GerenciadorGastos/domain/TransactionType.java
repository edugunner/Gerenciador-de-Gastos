package com.edugunner.GerenciadorGastos.domain;

public enum TransactionType {
    INCOME("Receita"),
    EXPENSE("Despesa");
    private final String description;

    TransactionType(String description) {
        this.description = description;
    }
}
