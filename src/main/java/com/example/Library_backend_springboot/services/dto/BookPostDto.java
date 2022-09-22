package com.example.Library_backend_springboot.services.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class BookPostDto {
    @NotNull(message = "نام کتاب را وارد کنید")
    private String name;

    @NotNull(message = "دسته بندی کتاب را وارد کنید")
    private String category;

    @NotNull(message = "نویسنده کتاب را وارد کنید")
    private String author;

    @NotNull(message = "تاریخ چاپ کتاب را وارد کنید")
    private int publish_year;
}
