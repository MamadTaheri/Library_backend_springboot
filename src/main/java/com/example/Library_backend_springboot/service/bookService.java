package com.example.Library_backend_springboot.service;

import com.example.Library_backend_springboot.model.bookModel;
import com.example.Library_backend_springboot.model.userModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface bookService {

    List<bookModel> getAllBooks();

    Integer saveNewBook(bookModel book);

    Optional<bookModel> getBook(Integer id);

    String updateBook(bookModel bookModel);

    String bookOut(String[] inputArray);
}
