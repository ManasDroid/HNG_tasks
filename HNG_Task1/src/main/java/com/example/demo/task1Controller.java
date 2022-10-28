package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class task1Controller {


    @GetMapping("/details")
    public task1Response user(){
        task1Response task1Response = new task1Response("manasdroid",true,22,"I am a backend Developer");
        return task1Response;
}
}
