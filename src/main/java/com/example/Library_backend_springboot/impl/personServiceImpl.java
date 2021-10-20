package com.example.Library_backend_springboot.impl;

import com.example.Library_backend_springboot.service.personService;
import org.springframework.stereotype.Service;

@Service
public class personServiceImpl implements personService {

    @Override
    public String sayHello() {

        return "Salam mamad";

    }
}
