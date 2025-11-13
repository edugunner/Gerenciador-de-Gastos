package com.edugunner.GerenciadorGastos.controllers;

import com.edugunner.GerenciadorGastos.dtos.TransactionDTO;
import com.edugunner.GerenciadorGastos.dtos.TransactionResponseDTO;
import com.edugunner.GerenciadorGastos.services.TransactionService;
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

    @PostMapping
    public ResponseEntity<TransactionResponseDTO> createTransaction(@RequestBody TransactionDTO body) {
        transactionService.createTransaction(body);
        TransactionResponseDTO responseDTO = new TransactionResponseDTO(
                body.userId(),
                body.description(),
                body.category(),
                body.type(),
                body.value());

        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }

}
