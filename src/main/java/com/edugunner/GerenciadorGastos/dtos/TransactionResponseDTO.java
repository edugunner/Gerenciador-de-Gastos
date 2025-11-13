package com.edugunner.GerenciadorGastos.dtos;

import com.edugunner.GerenciadorGastos.domain.TransactionType;

import java.math.BigDecimal;

public record TransactionResponseDTO(Long id, String description, String category, String type, BigDecimal value) {
}
