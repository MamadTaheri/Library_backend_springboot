package com.example.Library_backend_springboot.services.user;

import com.example.Library_backend_springboot.infrastructure.entities.UserEntity;
import com.example.Library_backend_springboot.services.dto.UserDto;
import com.example.Library_backend_springboot.services.dto.UserPostDto;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    List<UserDto> getAllUsers();

    boolean saveNewUser(UserPostDto userPostDto);

//    Optional<UserDto> getUser(Integer id);

//    String updateUser(Long userID, UserPostDto user);
}
