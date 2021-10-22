package com.example.Library_backend_springboot.impl;

import com.example.Library_backend_springboot.Repository.userRepository;
import com.example.Library_backend_springboot.model.userModel;
import com.example.Library_backend_springboot.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class userServiceImpl implements userService {

    @Autowired
    userRepository userRepositoryObj;

    @Override
    public List<userModel> getAllusers() {
            return userRepositoryObj.findAll();
    }

    @Override
    public Integer saveNewUser(userModel user) {
        try {
            userRepositoryObj.save(user);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

}
