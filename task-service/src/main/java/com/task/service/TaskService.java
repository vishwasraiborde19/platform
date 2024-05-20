package com.task.service;

import com.platform.common.domain.task.Task;
import com.task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task saveOrUpdateTask(Task task){
       return taskRepository.saveAndFlush(task);
    }

    public Optional<Task> get(Integer id){
        return taskRepository.findById(id);
    }

    public List<Task> getAll(){
        return taskRepository.getAll();
    }

    public void delete(Integer id){
        taskRepository.deleteByTaskId(id);
    }
}
