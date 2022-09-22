package com.example.Library_backend_springboot.services.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Setter
@Getter
public class UserPostDto {
    @NotNull(message = "نام را وارد کنید")
    private String name;

    @NotNull(message = "فامیلی را وارد کنید")
    private String family;

    @NotNull(message = "کد ملی را وارد کنید")
    private Long socialNumber;
}
