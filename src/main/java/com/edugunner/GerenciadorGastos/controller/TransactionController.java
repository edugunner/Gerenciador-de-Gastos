package com.edugunner.GerenciadorGastos.controller;

import com.edugunner.GerenciadorGastos.api.dtos.TransactionRequest;
import com.edugunner.GerenciadorGastos.api.dtos.TransactionResponse;
import com.edugunner.GerenciadorGastos.domain.TransactionModel;
import com.edugunner.GerenciadorGastos.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    TransactionService transactionService;


    @PostMapping("/new")
    public ResponseEntity<TransactionResponse> createTransaction(@RequestBody TransactionRequest transactionRequest) {
        TransactionModel createdTransaction = transactionService.createTransaction(transactionRequest);

        TransactionResponse transactionResponse = new TransactionResponse(
                createdTransaction.getCategory(),
                createdTransaction.getDescription(),
                createdTransaction.getAmount(),
                createdTransaction.getType(),
                createdTransaction.getTransactionDate(),
                createdTransaction.getId()
                );
        return new ResponseEntity<>(transactionResponse, HttpStatus.CREATED);
    }

    public void deleteTransaction(@RequestBody TransactionModel transactionModel) {


    }
}
