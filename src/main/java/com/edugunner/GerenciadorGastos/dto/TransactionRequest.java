package com.edugunner.GerenciadorGastos.dto;

import com.edugunner.GerenciadorGastos.domain.transaction.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TransactionRequest(String category, String description, BigDecimal amount, TransactionType type, LocalDateTime transactionDate) {

}
