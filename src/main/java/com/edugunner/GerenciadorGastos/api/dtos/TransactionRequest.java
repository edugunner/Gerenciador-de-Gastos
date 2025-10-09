package com.edugunner.GerenciadorGastos.api.dtos;

import com.edugunner.GerenciadorGastos.domain.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionRequest {

    private String category;
    private String description;
    private BigDecimal amount;
    private TransactionType type;
    private LocalDateTime transactionDate;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }
}
