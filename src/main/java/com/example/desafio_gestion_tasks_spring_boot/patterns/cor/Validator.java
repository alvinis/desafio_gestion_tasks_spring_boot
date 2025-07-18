package com.example.desafio_gestion_tasks_spring_boot.patterns.cor;

public interface Validator<T> {

    void setNext(Validator<T> validator);

    void validate(T t);
}
