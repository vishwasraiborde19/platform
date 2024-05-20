package com.user.controller;

import com.platform.common.domain.user.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/ping")
    public String getMessage(){
        return "Task service is up" ;
    }

    @PostMapping("/user")
    public User addTask(@RequestBody User user){
         return userService.saveOrUpdateTask(user);
    }

    @GetMapping("/users")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/users/{id}")
    public Optional<User> getTaskById(@RequestParam Integer id){
        return userService.get(id);
    }

    @DeleteMapping("/users/{id}")
    public String deleteTaskById(@RequestParam Integer id){
        userService.delete(id);
          return "User Deleted";
    }

}
