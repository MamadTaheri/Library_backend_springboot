package com.example.Library_backend_springboot.Repository;

import com.example.Library_backend_springboot.model.bookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookRepository extends JpaRepository<bookModel, Integer> {
}
