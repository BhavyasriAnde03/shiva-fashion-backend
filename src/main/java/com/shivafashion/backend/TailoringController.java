package com.shivafashion.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tailoring")
public class TailoringController {

    @Autowired
    private TailoringRepository repository;

    @GetMapping
    public List<TailoringService> getAll() {
        return repository.findAll();
    }
}