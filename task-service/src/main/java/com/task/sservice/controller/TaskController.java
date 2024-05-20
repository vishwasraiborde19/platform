package com.task.sservice.controller;

import com.platform.platform.common.domain.task.Task;
import com.task.sservice.service.TaskService;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("/ping")
    public String getMessage(){
        return "Task service is up" ;
    }

    @PostMapping("/task")
    public Task addTask(@RequestBody Task task){
         return taskService.saveOrUpdateTask(task);
    }

    @GetMapping("/tasks")
    public List<Task> getAll(){
        return taskService.getAll();
    }

    @GetMapping("/tasks/{id}")
    public Optional<Task> getTaskById(@RequestParam Integer id){
        return taskService.get(id);
    }

    @DeleteMapping("/tasks/{id}")
    public String deleteTaskById(@RequestParam Integer id){
          taskService.delete(id);
          return "Task Deleted";
    }

}
