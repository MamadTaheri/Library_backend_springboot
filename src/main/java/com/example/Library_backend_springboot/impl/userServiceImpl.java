package com.example.Library_backend_springboot.impl;

import com.example.Library_backend_springboot.model.userModel;
import com.example.Library_backend_springboot.service.userService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class userServiceImpl implements userService {
    @Override
    public ArrayList<userModel> getAllusers() {
        ArrayList<userModel> usersArray = new ArrayList<>();

        userModel user1 = new userModel(1, "محمد", "طاهری", 256532);
        userModel user2 = new userModel(2, "علی", "علوی", 653985);
        userModel user3 = new userModel(3, "زهرا", "موسوی", 986532);
        userModel user4 = new userModel(4, "قاسم", "جمالی", 653258);
        userModel user5 = new userModel(5, "محبوبه", "نادری", 831501);

        usersArray.add(user1);
        usersArray.add(user2);
        usersArray.add(user3);
        usersArray.add(user4);
        usersArray.add(user5);

        return usersArray;
    }
}
