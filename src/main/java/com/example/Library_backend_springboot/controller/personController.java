package com.example.Library_backend_springboot.controller;

import com.example.Library_backend_springboot.service.personService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/person")
public class personController {

    @Autowired
    personService personService;

    @GetMapping(value = "/getperson")
    public String saySomething(){
        return personService.sayHello();
    }
}
