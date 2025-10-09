package com.edugunner.GerenciadorGastos.repository;

import com.edugunner.GerenciadorGastos.domain.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface UserRepository extends JpaRepository<UserModel, UUID> {

}
