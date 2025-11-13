package com.edugunner.GerenciadorGastos.repositories;

import com.edugunner.GerenciadorGastos.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
