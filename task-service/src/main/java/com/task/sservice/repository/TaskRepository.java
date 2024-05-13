package com.task.sservice.repository;

import com.platform.platformcommondomain.domain.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task,Integer> {

    List<Task> getTasks();
    Task deleteTaskByID(Integer taskId);
}
