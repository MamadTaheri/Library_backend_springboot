package com.example.Library_backend_springboot.controller;

import com.example.Library_backend_springboot.model.bookModel;
import com.example.Library_backend_springboot.model.userModel;
import com.example.Library_backend_springboot.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(value = "http://localhost:3000/")
@RequestMapping(value="/api")
public class BookController {

    @Autowired
    bookService bookServiceObject;

    @GetMapping( value = "/books")
    public List<bookModel> getAllBooks() {
        return bookServiceObject.getAllBooks();
    }

    @PostMapping( value = "/savenewbook")
    public Integer saveNewUser(@RequestBody bookModel book) {
        return bookServiceObject.saveNewBook(book);
    }

    @GetMapping(value = "/book")
    public Optional<bookModel> user(@RequestParam("id") Integer id){
        return bookServiceObject.getBook(id);
    }

}
