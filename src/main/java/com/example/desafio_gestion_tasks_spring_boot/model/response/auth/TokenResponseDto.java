package com.example.desafio_gestion_tasks_spring_boot.model.response.auth;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TokenResponseDto {

    private String token;
}
