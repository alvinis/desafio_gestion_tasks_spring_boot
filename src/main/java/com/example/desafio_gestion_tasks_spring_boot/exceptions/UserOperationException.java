package com.example.desafio_gestion_tasks_spring_boot.exceptions;

public class UserOperationException extends RuntimeException {

    public UserOperationException(String message) {
        super(message);
    }

}
