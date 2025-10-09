package com.edugunner.GerenciadorGastos.service;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.edugunner.GerenciadorGastos.api.dtos.UserRequest;
import com.edugunner.GerenciadorGastos.domain.UserModel;
import com.edugunner.GerenciadorGastos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserModel createUser(UserRequest userRequest){

        UserModel userModel = new UserModel();
        userModel.setName(userRequest.getName());
        userModel.setEmail(userRequest.getEmail());

        String hashedPassword = BCrypt.withDefaults().hashToString(12, userRequest.getPassword().toCharArray());
        userModel.setPassword(hashedPassword);


        return this.userRepository.save(userModel);
    }
}
