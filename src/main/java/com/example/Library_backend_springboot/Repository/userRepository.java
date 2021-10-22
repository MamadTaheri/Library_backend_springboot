package com.example.Library_backend_springboot.Repository;

import com.example.Library_backend_springboot.model.userModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<userModel, Integer> {
}
