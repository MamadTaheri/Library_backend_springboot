package com.example.Library_backend_springboot.controller;

import com.example.Library_backend_springboot.infrastructure.entities.UserEntity;
import com.example.Library_backend_springboot.services.dto.UserDto;
import com.example.Library_backend_springboot.services.dto.UserPostDto;
import com.example.Library_backend_springboot.services.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(value = "http://localhost:3000/")
@RequestMapping(value="/api/users")
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping()
    public List<UserDto> users() {
        return userService.getAllUsers();
    }

    @PostMapping()
    public boolean saveNewUser(@RequestBody UserPostDto user) {
        return userService.saveNewUser(user);
    }

//    @GetMapping("/user")
//    public Optional<UserEntity> user(@RequestParam("id") Integer id){
//        return userServiceObject.getUser(id);
//    }

//    @PostMapping("/updateuser")
//    public String user(@RequestBody UserEntity user) {
//        return userServiceObject.updateUser(user);
//    }

}
