package com.practica.examen.taskservice.service;

import com.practica.examen.taskservice.exception.LocalExceptionHandler;
import com.practica.examen.taskservice.model.Task;
import com.practica.examen.taskservice.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(String id) {
        return taskRepository.findById(id);
    }

    public Task updateTask(String id, Task updatedTask) {
        if (!taskRepository.existsById(id)) {
            throw new LocalExceptionHandler.TaskNotFoundException("Task with ID " + id + " not found.");
        }
        updatedTask.setId(id);
        return taskRepository.save(updatedTask);
    }

    public boolean deleteTask(String id) {
        taskRepository.deleteById(id);
        return false;
    }
}
