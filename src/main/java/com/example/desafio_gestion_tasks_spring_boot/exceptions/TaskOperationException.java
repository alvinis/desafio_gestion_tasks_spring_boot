package com.example.desafio_gestion_tasks_spring_boot.exceptions;

public class TaskOperationException extends RuntimeException {

    public TaskOperationException(String message) {
        super(message);
    }

}
