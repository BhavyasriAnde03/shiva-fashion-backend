package com.shivafashion.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/sarees")
public class SareeController {

    @Autowired
    private SareeRepository sareeRepository;

    @Autowired
    private SareeVariantRepository variantRepository;

    // Get all sarees
    @GetMapping
    public List<Saree> getAllSarees() {
        return sareeRepository.findAll();
    }

    // Get sarees by category
    @GetMapping("/category/{category}")
    public List<Saree> getByCategory(@PathVariable String category) {
        return sareeRepository.findByCategory(category);
    }

    // Get variants for a saree
    @GetMapping("/{sareeId}/variants")
    public List<SareeVariant> getVariants(@PathVariable int sareeId) {
        return variantRepository.findBySareeId(sareeId);
    }
}