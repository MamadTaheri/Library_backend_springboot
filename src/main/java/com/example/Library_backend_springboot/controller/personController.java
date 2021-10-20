package com.example.Library_backend_springboot.controller;

import com.example.Library_backend_springboot.model.userModel;
import com.example.Library_backend_springboot.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value="/api")
public class personController {

    @Autowired
    userService userServiceObject;

    @GetMapping( value = "/users")
    public ArrayList<userModel> users() {
        return userServiceObject.getAllusers();
    }

}
