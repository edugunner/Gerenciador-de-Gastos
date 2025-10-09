package com.edugunner.GerenciadorGastos.api.dtos;

import lombok.Data;

@Data
public class UserCreateDTO {
    private String email;
    private String password;
    private String name;
}
