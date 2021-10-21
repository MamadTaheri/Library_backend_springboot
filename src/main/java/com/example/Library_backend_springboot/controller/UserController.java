package com.example.Library_backend_springboot.controller;

import com.example.Library_backend_springboot.model.userModel;
import com.example.Library_backend_springboot.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(value = "http://localhost:3000/")
@RequestMapping(value="/api")
public class UserController {

    @Autowired
    userService userServiceObject;

    @GetMapping( value = "/users")
    public ArrayList<userModel> users() {
        return userServiceObject.getAllusers();
    }

    @PostMapping( value = "/singleuser")
    public userModel getMessage(@RequestParam(name = "name") String name,
                                @RequestParam(name = "family") String family) {
        return userServiceObject.getSingleuser(name, family);
    }

    @PostMapping( value = "/loginwithparam")
    public String checkAuthentication1(@RequestParam(name = "name") String name,
                                      @RequestParam(name = "family") String family) {
        return userServiceObject.checkAuthentication1(name, family);
    }

    @PostMapping( value = "/loginwithbody")
    public String checkAuthentication2(@RequestBody userModel user) {
        return userServiceObject.checkAuthentication2(user);
    }

    @PostMapping( value = "/savenewuser")
    public String saveNewUser(@RequestBody userModel user) {
        return userServiceObject.saveNewUser(user);
    }

}
