package com.task.sservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    @GetMapping("/hello")
    public String getMessage(){
        return "am up" ;
    }
}
