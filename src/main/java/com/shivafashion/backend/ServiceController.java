package com.shivafashion.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ServiceController {

    @Autowired
    private ServiceRepository repository;

    @GetMapping("/services")
    public List<Service> getServices() {
        return repository.findAll();
    }
}