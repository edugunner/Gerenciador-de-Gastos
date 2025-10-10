package com.edugunner.GerenciadorGastos.controller;

import com.edugunner.GerenciadorGastos.api.dtos.UserRequest;
import com.edugunner.GerenciadorGastos.domain.UserModel;
import com.edugunner.GerenciadorGastos.repository.UserRepository;
import com.edugunner.GerenciadorGastos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/create")
    public ResponseEntity<UserModel> createUser(@RequestBody UserRequest userRequest){
        UserModel createdUser = userService.createUser(userRequest);

        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
}
