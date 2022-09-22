package com.example.Library_backend_springboot.controller;

import com.example.Library_backend_springboot.infrastructure.entities.EmployeeEntity;
import com.example.Library_backend_springboot.infrastructure.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "http://localhost:3000/")
@RequestMapping(value="/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping()
    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @PostMapping()
    public ResponseEntity<String> saveNewEmployee(@RequestBody EmployeeEntity empData) {
        employeeRepository.save(empData);
        return ResponseEntity.ok("Data saved");
    }
}


