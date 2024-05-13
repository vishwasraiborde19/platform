package com.task.sservice.service;

import com.netflix.discovery.converters.Auto;
import com.platform.platformcommondomain.domain.task.Task;
import com.task.sservice.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//ta

@Service
public class TaskService {
a
    @Autowired
    private TaskRepository taskRepository;

    public Task saveOrUpdateTask(Task task){
        taskRepository.saveAndFlush(task);
        return task;
    }

    public Task get(Task task){
        return taskRepository.getReferenceById(task.getTaskId());
    }

    public List<Task> getAll(Task task){
        return taskRepository.getTasks();
    }

    public Task delete(Task task){
        return taskRepository.deleteTaskByID(task.getTaskId());
    }
}
