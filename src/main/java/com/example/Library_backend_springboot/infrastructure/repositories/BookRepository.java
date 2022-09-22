package com.example.Library_backend_springboot.infrastructure.repositories;

import com.example.Library_backend_springboot.infrastructure.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {
}
