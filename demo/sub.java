package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sub {
    @GetMapping("/sub")
    public int sub(@RequestParam() int num1, @RequestParam() int num2) {
        return num1 - num2;
    }
}
