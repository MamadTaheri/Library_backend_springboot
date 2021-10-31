package com.example.Library_backend_springboot.service;

import com.example.Library_backend_springboot.model.userModel;

import java.util.List;
import java.util.Optional;

public interface userService {

    List<userModel> getAllusers();

    Integer saveNewUser(userModel user);

    Optional<userModel> getUser(Integer id);

}
