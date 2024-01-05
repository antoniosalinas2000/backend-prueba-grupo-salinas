package com.practica.examen.taskservice.service;

import com.practica.examen.taskservice.model.Task;
import com.practica.examen.taskservice.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TaskServiceTest {

    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService taskService;

    @Test
    void createTaskTest() {
        Task task = new Task();
        task.setTitle("Test Task");
        task.setDescription("Test Description");
        when(taskRepository.save(any(Task.class))).thenReturn(task);

        Task created = taskService.createTask(task);

        assertNotNull(created);
        assertEquals("Test Task", created.getTitle());
        assertEquals("Test Description", created.getDescription());
    }
}
