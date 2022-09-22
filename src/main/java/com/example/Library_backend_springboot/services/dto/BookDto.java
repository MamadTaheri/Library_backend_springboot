package com.example.Library_backend_springboot.services.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookDto {

    private int bookId;
    private String name;
    private String category;
    private String author;
    private int publish_year;

}
