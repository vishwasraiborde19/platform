package com.task.repository;


import com.platform.common.domain.task.Task;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface TaskRepository extends JpaRepository<Task,Integer> {

    @Query("select  t from Task t")
    List<Task> getAll();
    void deleteByTaskId(Integer id);
}
