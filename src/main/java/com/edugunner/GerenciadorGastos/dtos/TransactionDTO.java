package com.edugunner.GerenciadorGastos.dtos;

import com.edugunner.GerenciadorGastos.domain.TransactionType;
import com.edugunner.GerenciadorGastos.domain.User;

import java.math.BigDecimal;

public record TransactionDTO (BigDecimal value, String description, String type, Long userId, String category) {
}
