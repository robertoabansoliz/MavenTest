package com.example.demo.controller;

import com.example.demo.model.hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class ControllerTest {

    private static final String template = "Hello, gradle %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello-world")
    @ResponseBody
    public hello sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        return new hello(counter.incrementAndGet(), String.format(template, name));
    }
}