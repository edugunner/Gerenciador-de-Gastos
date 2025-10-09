package com.edugunner.GerenciadorGastos.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class TransactionModel {

    private String category;
    private String description;
    private BigDecimal amount;
    private TransactionType type;
    private LocalDateTime transactionDate;

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;


    @CreationTimestamp
    private LocalDateTime createdAt;
}
