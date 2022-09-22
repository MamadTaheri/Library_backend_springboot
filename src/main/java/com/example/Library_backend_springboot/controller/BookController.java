package com.example.Library_backend_springboot.controller;

import com.example.Library_backend_springboot.infrastructure.entities.BookEntity;
import com.example.Library_backend_springboot.services.book.IBookService;
import com.example.Library_backend_springboot.services.dto.BookDto;
import com.example.Library_backend_springboot.services.dto.BookPostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(value = "http://localhost:3000/")
@RequestMapping(value="/api/books")
public class BookController {

    @Autowired
    IBookService bookService;

    @GetMapping()
    public List<BookDto> getAllBooks() {
        return bookService.getAllBooks();
    }
//
    @PostMapping()
    public ResponseEntity<String> saveNewUser(@RequestBody BookPostDto book) throws Exception {
        boolean saveResult = bookService.saveNewBook(book);
        if(saveResult)
            return ResponseEntity.ok("Save Successful");
        else
            throw new Exception("Error on save");

    }


//    @GetMapping("/book")
//    public Optional<BookEntity> user(@RequestParam("id") Integer id){
//        return bookServiceObject.getBook(id);
//    }
//
//    @PostMapping("/updatebook")
//    public String book(@RequestBody BookEntity book) {
//        return bookServiceObject.updateBook(book);
//    }
//    @PostMapping("/bookout")
//    public String bookOut(@RequestBody String[] inputArray) {
//        return bookServiceObject.bookOut(inputArray);
//    }
//
//    @PostMapping("bookin")
//    public String bookIn(@RequestBody String[] inputArray) {
//        return bookServiceObject.bookIn(Integer.valueOf(inputArray[0]));
//    }

}
