package com.shivafashion.backend;

import jakarta.persistence.*;

@Entity
@Table(name = "SareeVariants")
public class SareeVariant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int variantId;
    private int sareeId;
    private String color;
    private String imageUrl;

    // Getters and Setters
    public int getVariantId() { return variantId; }
    public void setVariantId(int variantId) { this.variantId = variantId; }
    public int getSareeId() { return sareeId; }
    public void setSareeId(int sareeId) { this.sareeId = sareeId; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}