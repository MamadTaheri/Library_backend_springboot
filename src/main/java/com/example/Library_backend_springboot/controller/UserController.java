package com.example.Library_backend_springboot.controller;

import com.example.Library_backend_springboot.model.userModel;
import com.example.Library_backend_springboot.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value="/api")
public class UserController {

    @Autowired
    userService userServiceObject;

    @CrossOrigin(value = "http://localhost:3000/")
    @GetMapping( value = "/users")
    public ArrayList<userModel> users() {
        return userServiceObject.getAllusers();
    }

    @PostMapping( value = "/singleuser")
    public userModel getMessage(@RequestParam(name = "name") String name,
                                @RequestParam(name = "family") String family) {
        return userServiceObject.getSingleuser(name, family);
    }

}
