package com.mimacom.training.fizzbuzz.infrastructure.web;

import com.mimacom.training.fizzbuzz.api.FizzBuzzService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController("api/fizzbuzz")
public class FizzBuzzController {

    private final FizzBuzzService fizzBuzzService;

    public FizzBuzzController(FizzBuzzService fizzBuzzService) {
        this.fizzBuzzService = fizzBuzzService;
    }

    @GetMapping
    public List<String> get() {
        //return fizzBuzzService.compute(1, 100);
        return null;
    }
}
