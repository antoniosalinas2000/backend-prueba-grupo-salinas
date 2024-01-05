package com.practica.examen.taskservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class LocalExceptionHandler {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public static class TaskNotFoundException extends RuntimeException {
        public TaskNotFoundException(String message) {
            super(message);
        }
    }
}
