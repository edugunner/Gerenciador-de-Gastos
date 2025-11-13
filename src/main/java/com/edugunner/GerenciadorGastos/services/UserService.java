package com.edugunner.GerenciadorGastos.services;


import com.edugunner.GerenciadorGastos.domain.User;
import com.edugunner.GerenciadorGastos.dtos.UserDTO;
import com.edugunner.GerenciadorGastos.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;




    public User createUser(UserDTO userDTO) {
        User user = new User();

        user.setName(userDTO.name());
        user.setEmail(userDTO.email());
        user.setPassword(userDTO.password());

        return userRepository.save(user);
    }
}
