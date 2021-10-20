package com.example.Library_backend_springboot.controller;

import com.example.Library_backend_springboot.model.bookModel;
import com.example.Library_backend_springboot.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value="/api")
public class bookController {

    @Autowired
    bookService bookServiceObject;

    @CrossOrigin(value = "http://localhost:3000/")
    @GetMapping( value = "/books")
    public ArrayList<bookModel> getAllBooks() {
        return bookServiceObject.getAllBooks();
    }

}
