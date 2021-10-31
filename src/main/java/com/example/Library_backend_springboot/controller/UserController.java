package com.example.Library_backend_springboot.controller;

import com.example.Library_backend_springboot.model.userModel;
import com.example.Library_backend_springboot.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(value = "http://localhost:3000/")
@RequestMapping(value="/api")
public class UserController {

    @Autowired
    userService userServiceObject;

    @GetMapping( value = "/users")
    public List<userModel> users() {
        return userServiceObject.getAllusers();
    }

    @PostMapping( value = "/savenewuser")
    public Integer saveNewUser(@RequestBody userModel user) {
        return userServiceObject.saveNewUser(user);
    }

    @GetMapping(value = "/user")
    public Optional<userModel> user(@RequestParam("id") Integer id){
        return userServiceObject.getUser(id);
    }

}
