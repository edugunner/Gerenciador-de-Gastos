package com.edugunner.GerenciadorGastos.services;

import com.edugunner.GerenciadorGastos.domain.Transaction;
import com.edugunner.GerenciadorGastos.domain.User;
import com.edugunner.GerenciadorGastos.dtos.TransactionDTO;
import com.edugunner.GerenciadorGastos.repositories.TransactionRepository;
import com.edugunner.GerenciadorGastos.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    @Autowired
    UserRepository userRepository;
    public TransactionService(TransactionRepository transactionRepository, UserRepository userRepository) {
        this.transactionRepository = transactionRepository;
        this.userRepository = userRepository;
    }

    public Transaction createTransaction(TransactionDTO body) {
        var userId = this.userRepository.findById(body.userId());
        if (userId.isEmpty()) {
            throw new IllegalArgumentException("User not found");
        }
        Transaction transaction = new Transaction();
        transaction.setValue(body.value());
        transaction.setDescription(body.description());
        transaction.setCategory(body.category());
        transaction.setUser(userId.get());

        return transactionRepository.save(transaction);
    }
}
