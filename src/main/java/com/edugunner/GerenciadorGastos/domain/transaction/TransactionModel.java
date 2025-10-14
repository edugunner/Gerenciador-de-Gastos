package com.edugunner.GerenciadorGastos.domain.transaction;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "tb_transactions")
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
