package com.luminesway.ecommerce.controllers;

import com.luminesway.ecommerce.services.HelloWorldService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloWorldController {

    private final HelloWorldService service;


    @GetMapping
    public String helloWorld(){
        return service.getHelloWorld();
    }
}
