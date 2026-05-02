package com.shivafashion.backend;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "DressMaterials")
public class DressMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dressId;
    private String title;
    private String fabric;
    private BigDecimal price;
    private String imageUrl;
    private String sortOrder;

    public int getDressId() { return dressId; }
    public void setDressId(int dressId) { this.dressId = dressId; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getFabric() { return fabric; }
    public void setFabric(String fabric) { this.fabric = fabric; }
    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
    public String getSortOrder() { return sortOrder; }
    public void setSortOrder(String sortOrder) { this.sortOrder = sortOrder; }
}