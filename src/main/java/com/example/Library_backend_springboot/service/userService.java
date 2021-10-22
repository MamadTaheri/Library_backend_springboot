package com.example.Library_backend_springboot.service;

import com.example.Library_backend_springboot.model.userModel;

import java.util.ArrayList;
import java.util.List;

public interface userService {

    List<userModel> getAllusers();

    Integer saveNewUser(userModel user);

}
