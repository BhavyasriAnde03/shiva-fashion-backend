package com.shivafashion.backend;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Sarees")
public class Saree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sareeId;
    private String title;
    private String category;
    private BigDecimal minPrice;
    private BigDecimal maxPrice;
    private String thumbnailUrl;

    // Getters and Setters
    public int getSareeId() { return sareeId; }
    public void setSareeId(int sareeId) { this.sareeId = sareeId; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public BigDecimal getMinPrice() { return minPrice; }
    public void setMinPrice(BigDecimal minPrice) { this.minPrice = minPrice; }
    public BigDecimal getMaxPrice() { return maxPrice; }
    public void setMaxPrice(BigDecimal maxPrice) { this.maxPrice = maxPrice; }
    public String getThumbnailUrl() { return thumbnailUrl; }
    public void setThumbnailUrl(String thumbnailUrl) { this.thumbnailUrl = thumbnailUrl; }
}