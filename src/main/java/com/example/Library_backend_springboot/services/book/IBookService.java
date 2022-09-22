package com.example.Library_backend_springboot.services.book;

import com.example.Library_backend_springboot.infrastructure.entities.BookEntity;
import com.example.Library_backend_springboot.services.dto.BookDto;
import com.example.Library_backend_springboot.services.dto.BookPostDto;

import java.util.List;
import java.util.Optional;

public interface IBookService {

    List<BookDto> getAllBooks();

    boolean saveNewBook(BookPostDto book);

//    Optional<BookEntity> getBook(Integer id);

//    String updateBook(Long bookID, BookPostDto book);

//    String bookOut(String[] inputArray);

//    String bookIn(Integer bookId);
}
