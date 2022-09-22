package com.example.Library_backend_springboot.services.book;

import com.example.Library_backend_springboot.infrastructure.repositories.BookRepository;
import com.example.Library_backend_springboot.infrastructure.entities.BookEntity;
import com.example.Library_backend_springboot.services.dto.BookDto;
import com.example.Library_backend_springboot.services.dto.BookPostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService implements IBookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<BookDto> getAllBooks() {
        List<BookDto> dtoList = new ArrayList<>();
        List<BookEntity> entityList = bookRepository.findAll();
        for(BookEntity entity: entityList){
            BookDto dto = new BookDto();
            dto.setBookId(entity.getBookId());
            dto.setAuthor(entity.getAuthor());
            dto.setCategory(entity.getCategory());
            dto.setName(entity.getName());
            dto.setPublish_year(entity.getPublish_year());
            dtoList.add(dto);
        }
        return dtoList;
    }

    @Override
    public boolean saveNewBook(BookPostDto book) {
       try {
           BookEntity entity = new BookEntity();
           entity.setAuthor(book.getAuthor());
           entity.setCategory(book.getCategory());
           entity.setName(book.getName());
           entity.setPublish_year(book.getPublish_year());
           bookRepository.save(entity);
           return true;
       } catch (Exception e){
           e.printStackTrace();
           return false;
       }
    }

//    @Override
//    public List<BookEntity> getAllBooks() {
//
//        return bookRepositoryObj.findAll();
//    }

//    @Override
//    public Integer saveNewBook(BookEntity book) {
//        try {
//            bookRepositoryObj.save(book);
//            return 1;
//        } catch (Exception e) {
//            return 0;
//        }
//    }

//    @Override
//    public Optional<BookEntity> getBook(Integer id) {
//        return bookRepositoryObj.findById(id);
//    }

//    @Override
//    public String updateBook(BookEntity bookModel) {
//        try {
//            BookEntity tempBookModel = bookRepositoryObj.getById(bookModel.getId());
//            tempBookModel.setName(bookModel.getName());
//            tempBookModel.setAuthor(bookModel.getAuthor());
//            tempBookModel.setCategory(bookModel.getCategory());
//            tempBookModel.setPublish_year(bookModel.getPublish_year());
//            bookRepositoryObj.save(tempBookModel);
//            return "ok";
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "server error";
//        }
//    }

//    @Override
//    public String bookOut(String[] inputArray) {
//        try {
//            String bookId = inputArray[0];
//            String userId = inputArray[1];
//            BookEntity tempBookModel = bookRepositoryObj.getById(Integer.parseInt(bookId));
//            tempBookModel.setAmanat_status(1);
//            tempBookModel.setUser(Integer.parseInt(userId));
//            bookRepositoryObj.save(tempBookModel);
//            return "ok";
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "server error";
//        }
//    }

//    @Override
//    public String bookIn(Integer bookId) {
//        try {
//            BookEntity tempBookModel = bookRepositoryObj.getById(bookId);
//            tempBookModel.setAmanat_status(0);
//            tempBookModel.setUser(0);
//            bookRepositoryObj.save(tempBookModel);
//            return "ok";
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "server error";
//        }
//    }
}
