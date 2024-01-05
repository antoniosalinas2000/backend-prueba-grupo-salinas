package com.practica.examen.taskservice.repository;

import com.practica.examen.taskservice.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
    // Métodos de consulta personalizados si es necesario
}
