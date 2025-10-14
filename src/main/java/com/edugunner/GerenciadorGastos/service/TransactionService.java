package com.edugunner.GerenciadorGastos.service;

import com.edugunner.GerenciadorGastos.dto.TransactionRequest;
import com.edugunner.GerenciadorGastos.domain.transaction.TransactionModel;
import com.edugunner.GerenciadorGastos.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.UUID;


@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;



    public TransactionModel createTransaction(TransactionRequest transactionRequest) {
        TransactionModel transactionModel = new TransactionModel();
        transactionModel.setCategory(transactionRequest.category());
        transactionModel.setDescription(transactionRequest.description());
        transactionModel.setAmount(transactionRequest.amount());
        transactionModel.setType(transactionRequest.type());
        transactionModel.setTransactionDate(transactionRequest.transactionDate());

        if (transactionRequest.amount() == null || transactionRequest.amount().doubleValue() <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }   if (transactionRequest.type() == null) {
            throw new IllegalArgumentException("Transaction type must be provided");
        }
        return this.transactionRepository.save(transactionModel);
    }

    public TransactionModel readTransaction(UUID id) {

        return this.transactionRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Transaction not found"));
    }

    public TransactionModel deleteTransaction(TransactionModel transactionModel) {
        this.transactionRepository.findAllById(Collections.singleton(transactionModel.getId()));

        return transactionModel;
    }
}
