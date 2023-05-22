package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mul {
    @GetMapping("/mul")
    public int mul(@RequestParam() int num1, @RequestParam() int num2) {
        return num1 * num2;
    }
}
