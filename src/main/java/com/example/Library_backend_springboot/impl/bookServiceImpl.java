package com.example.Library_backend_springboot.impl;

import com.example.Library_backend_springboot.model.bookModel;
import com.example.Library_backend_springboot.service.bookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class bookServiceImpl implements bookService {

    @Override
    public ArrayList<bookModel> getAllBooks() {
        ArrayList<bookModel> booksArray = new ArrayList<>();

        bookModel book1 = new bookModel(1, "مردی به نام اوه", "تاریخی", "فردریک بکمن" ,2017);
        bookModel book2 = new bookModel(2, "جنایت و مکافات", "سیاسی", "داستایوفسکی" ,1866);
        bookModel book3 = new bookModel(3, "سریر شیشه ای", "علوم پایه", "سارا جی ماس" ,2012);
        bookModel book4 = new bookModel(4, "مرد نامرئی", "رمان", "ژول ورن" ,1963);
        bookModel book5 = new bookModel(5, "سفر در زمان", "علمی", "ژول ورن" ,1982);

        booksArray.add(book1);
        booksArray.add(book2);
        booksArray.add(book3);
        booksArray.add(book4);
        booksArray.add(book5);

        return booksArray;
    }
}
