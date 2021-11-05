package com.example.Library_backend_springboot.impl;

import com.example.Library_backend_springboot.Repository.bookRepository;
import com.example.Library_backend_springboot.model.bookModel;
import com.example.Library_backend_springboot.model.userModel;
import com.example.Library_backend_springboot.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<bookModel> getBook(Integer id) {
        return bookRepositoryObj.findById(id);
    }

    @Override
    public String updateBook(bookModel bookModel) {
        try {
            bookModel tempBookModel = bookRepositoryObj.getById(bookModel.getId());
            tempBookModel.setName(bookModel.getName());
            tempBookModel.setAuthor(bookModel.getAuthor());
            tempBookModel.setCategory(bookModel.getCategory());
            tempBookModel.setPublish_year(bookModel.getPublish_year());
            bookRepositoryObj.save(tempBookModel);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    @Override
    public String bookOut(String[] inputArray) {
        try {
            String bookId = inputArray[0];
            String userId = inputArray[1];
            bookModel tempBookModel = bookRepositoryObj.getById(Integer.parseInt(bookId));
            tempBookModel.setAmanat_status(1);
            tempBookModel.setUser(Integer.parseInt(userId));
            bookRepositoryObj.save(tempBookModel);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    @Override
    public String bookIn(Integer bookId) {
        try {
            bookModel tempBookModel = bookRepositoryObj.getById(bookId);
            tempBookModel.setAmanat_status(0);
            tempBookModel.setUser(0);
            bookRepositoryObj.save(tempBookModel);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
}
