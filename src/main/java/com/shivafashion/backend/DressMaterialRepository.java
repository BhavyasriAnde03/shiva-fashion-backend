package com.shivafashion.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DressMaterialRepository extends JpaRepository<DressMaterial, Integer> {
    List<DressMaterial> findBySortOrder(String sortOrder);
    List<DressMaterial> findAllByOrderByPriceAsc();
}