package com.shivafashion.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SareeRepository extends JpaRepository<Saree, Integer> {
    List<Saree> findByCategory(String category);
}