package com.edugunner.GerenciadorGastos.api.dtos;

import lombok.Getter;
import lombok.Setter;


public record UserRequest(String name, String email, String password) {

}
