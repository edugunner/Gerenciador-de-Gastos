package com.edugunner.GerenciadorGastos.api.dtos;

import com.edugunner.GerenciadorGastos.domain.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record TransactionResponse(String category, String description, BigDecimal amount, TransactionType type, LocalDateTime transactionDate, UUID id) {

}
