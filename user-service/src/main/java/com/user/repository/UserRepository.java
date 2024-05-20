package com.user.repository;


import com.platform.common.domain.user.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User,Integer> {

    @Query("select  t from User t")
    List<User> getAll();
    void deleteByUserId(Integer id);
}
