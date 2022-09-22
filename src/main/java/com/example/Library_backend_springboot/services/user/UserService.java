package com.example.Library_backend_springboot.services.user;

import com.example.Library_backend_springboot.infrastructure.repositories.UserRepository;
import com.example.Library_backend_springboot.infrastructure.entities.UserEntity;
import com.example.Library_backend_springboot.services.dto.UserDto;
import com.example.Library_backend_springboot.services.dto.UserPostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService  {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserDto> getAllUsers() {
        List<UserDto> dtoList = new ArrayList<>();
        List<UserEntity> entityList = userRepository.findAll();
        for (UserEntity entity: entityList){
            UserDto dto = new UserDto();
            dto.setUserID(entity.getUserID());
            dto.setName(entity.getName());
            dto.setFamily(entity.getFamily());
            dto.setSocialNumber(entity.getSocialNumber());
            dtoList.add(dto);
        }
        return dtoList;
    }

    @Override
    public boolean saveNewUser(UserPostDto userPostDto) {
        try {
            UserEntity userEntity = new UserEntity();
            userEntity.setName(userPostDto.getName());
            userEntity.setFamily(userPostDto.getFamily());
            userEntity.setSocialNumber(userPostDto.getSocialNumber());
            userRepository.save(userEntity);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

//    @Override
//    public Optional<UserEntity> getUser(Integer id) {
//        return userRepositoryObj.findById(id);
//    }

//    @Override
//    public String updateUser(UserEntity userModel) {
//        try {
//            UserEntity tempUserModel = userRepositoryObj.getById(userModel.getId());
//            tempUserModel.setName(userModel.getName());
//            tempUserModel.setFamily(userModel.getFamily());
//            tempUserModel.setSocialNumber(userModel.getSocialNumber());
//            userRepositoryObj.save(tempUserModel);
//            return "ok";
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "server error";
//        }
//    }
}
