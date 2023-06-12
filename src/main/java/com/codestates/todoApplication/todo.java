package com.codestates.todoApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class todo {
    @GetMapping
    public String hellowWorld() {
        return "To-do Application!";
    }
}
