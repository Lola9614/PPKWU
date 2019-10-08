package com.example.reverse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reverse")
public class Controller {

    @GetMapping
    String reverse(@RequestParam String input){
        return new StringBuilder(input).reverse().toString();
    }
}
