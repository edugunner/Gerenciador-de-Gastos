package com.edugunner.GerenciadorGastos.controller;

import com.edugunner.GerenciadorGastos.api.dtos.TransactionRequest;
import com.edugunner.GerenciadorGastos.domain.TransactionModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TransactionController {



    public ResponseEntity<TransactionModel> createTransaction(@RequestBody TransactionRequest transactionRequest) {
        TransactionModel transactionModel;

    }
}
