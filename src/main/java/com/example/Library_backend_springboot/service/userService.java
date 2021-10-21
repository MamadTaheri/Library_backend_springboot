package com.example.Library_backend_springboot.service;

import com.example.Library_backend_springboot.model.userModel;

import java.util.ArrayList;

public interface userService {

    ArrayList<userModel> getAllusers();

    userModel getSingleuser(String name, String family);

    String checkAuthentication1(String name, String family);

    String checkAuthentication2(userModel user);

    String saveNewUser(userModel user);

}
