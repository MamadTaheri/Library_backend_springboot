package com.example.Library_backend_springboot.services.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {

    private Long userID;
    private String name;
    private String family;
    private Long socialNumber;

}
