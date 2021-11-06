package com.example.Library_backend_springboot.controller;

import com.example.Library_backend_springboot.model.bookModel;
import com.example.Library_backend_springboot.model.userModel;
import com.example.Library_backend_springboot.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(value = "http://localhost:3000/")
@RequestMapping(value="/api")
public class BookController {

    @Autowired
    bookService bookServiceObject;

    @GetMapping("/books")
    public List<bookModel> getAllBooks() {
        return bookServiceObject.getAllBooks();
    }

    @PostMapping("/savenewbook")
    public Integer saveNewUser(@RequestBody bookModel book) {
        return bookServiceObject.saveNewBook(book);
    }

    @GetMapping("/book")
    public Optional<bookModel> user(@RequestParam("id") Integer id){
        return bookServiceObject.getBook(id);
    }

    @PostMapping("/updatebook")
    public String book(@RequestBody bookModel book) {
        return bookServiceObject.updateBook(book);
    }
    @PostMapping("/bookout")
    public String bookOut(@RequestBody String[] inputArray) {
        return bookServiceObject.bookOut(inputArray);
    }

    @PostMapping("bookin")
    public String bookIn(@RequestBody String[] inputArray) {
        return bookServiceObject.bookIn(Integer.valueOf(inputArray[0]));
    }

}
