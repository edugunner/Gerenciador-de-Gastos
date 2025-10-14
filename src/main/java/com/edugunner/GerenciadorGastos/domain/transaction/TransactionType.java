package com.edugunner.GerenciadorGastos.domain.transaction;

import lombok.Getter;

@Getter
public enum TransactionType {
    INCOME,
    EXPENSE;
    String description;


}
