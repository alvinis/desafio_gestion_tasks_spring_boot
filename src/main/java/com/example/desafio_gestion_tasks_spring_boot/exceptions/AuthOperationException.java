package com.example.desafio_gestion_tasks_spring_boot.exceptions;

public class AuthOperationException extends RuntimeException {

    public AuthOperationException(String message) {
        super(message);
    }

}
