package com.edugunner.GerenciadorGastos.dto;

import com.edugunner.GerenciadorGastos.domain.transaction.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record TransactionResponse(String category, String description, BigDecimal amount, TransactionType type, LocalDateTime transactionDate, UUID id) {

}
