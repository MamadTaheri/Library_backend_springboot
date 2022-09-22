package com.example.Library_backend_springboot.infrastructure.repositories;

import com.example.Library_backend_springboot.infrastructure.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
