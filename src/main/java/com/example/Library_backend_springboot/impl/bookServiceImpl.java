package com.example.Library_backend_springboot.impl;

import com.example.Library_backend_springboot.Repository.bookRepository;
import com.example.Library_backend_springboot.model.bookModel;
import com.example.Library_backend_springboot.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class bookServiceImpl implements bookService {

    @Autowired
    bookRepository bookRepositoryObj;

    @Override
    public List<bookModel> getAllBooks() {

        return bookRepositoryObj.findAll();
    }

    @Override
    public Integer saveNewBook(bookModel book) {
        try {
            bookRepositoryObj.save(book);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
}
