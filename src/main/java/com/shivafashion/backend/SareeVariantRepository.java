package com.shivafashion.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SareeVariantRepository extends JpaRepository<SareeVariant, Integer> {
    List<SareeVariant> findBySareeId(int sareeId);
}