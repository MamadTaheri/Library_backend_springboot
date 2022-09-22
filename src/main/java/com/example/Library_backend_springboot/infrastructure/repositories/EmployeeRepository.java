package com.example.Library_backend_springboot.infrastructure.repositories;

import com.example.Library_backend_springboot.infrastructure.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
