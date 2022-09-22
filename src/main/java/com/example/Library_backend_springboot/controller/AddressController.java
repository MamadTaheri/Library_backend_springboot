package com.example.Library_backend_springboot.controller;

import com.example.Library_backend_springboot.infrastructure.entities.AddressEntity;
import com.example.Library_backend_springboot.infrastructure.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(value = "http://localhost:3000/")
@RequestMapping(value="/api/addresses")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping()
    public List<AddressEntity> getAllAddresses(){
        return addressRepository.findAll();
    }
}

