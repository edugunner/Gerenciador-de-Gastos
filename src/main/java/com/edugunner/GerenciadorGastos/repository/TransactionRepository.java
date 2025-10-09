package com.edugunner.GerenciadorGastos.repository;

import com.edugunner.GerenciadorGastos.domain.TransactionModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransactionRepository extends JpaRepository<TransactionModel, UUID> {
}
