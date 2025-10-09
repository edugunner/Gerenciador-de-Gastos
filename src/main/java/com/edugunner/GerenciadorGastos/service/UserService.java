package com.edugunner.GerenciadorGastos.service;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.edugunner.GerenciadorGastos.domain.UserModel;
import com.edugunner.GerenciadorGastos.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserModel createUser(UserModel userModel){

        String hashredPassword = BCrypt.withDefaults().hashToString(12, userModel.getPassword().toCharArray());
        userModel.setPassword(hashredPassword);
        return userRepository.save(userModel);
    }
}
