package com.example.demo.controller;

import com.example.demo.pojo.Cycle;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/app")
@RestController
public class HomeController {


    @GetMapping(value = "cycle",produces = MediaType.APPLICATION_JSON_VALUE)
    public Cycle getCycle(){
        //    return "Hello From rest service.";
    return new Cycle("22", "Yellow", 500);
    }

    @GetMapping(value = "home")
    public String home(){
        return "Hello from cycle app";
    }



}
