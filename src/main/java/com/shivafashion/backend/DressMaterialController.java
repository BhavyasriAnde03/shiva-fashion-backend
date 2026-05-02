package com.shivafashion.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/dresses")
public class DressMaterialController {

    @Autowired
    private DressMaterialRepository repository;

    // Get all dresses
    @GetMapping
    public List<DressMaterial> getAll() {
        return repository.findAll();
    }

    // Get by sort order (popular / new)
    @GetMapping("/sort/{sortOrder}")
    public List<DressMaterial> getBySort(@PathVariable String sortOrder) {
        return repository.findBySortOrder(sortOrder);
    }

    // Get price low to high
    @GetMapping("/price-asc")
    public List<DressMaterial> getByPriceAsc() {
        return repository.findAllByOrderByPriceAsc();
    }
}