package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rmul {
    @GetMapping("/rmul")
    public double rmul(@RequestParam() double num1, @RequestParam() double num2) {
        return num1 / num2;
    }
}
