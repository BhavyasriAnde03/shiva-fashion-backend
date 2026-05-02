package com.shivafashion.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/maggam")
public class MaggamController {

    @Autowired
    private MaggamRepository repository;

    @GetMapping
    public List<MaggamItem> getAll() {
        return repository.findAll();
    }
}