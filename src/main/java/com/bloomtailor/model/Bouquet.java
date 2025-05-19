package com.bloomtailor.model;

public class Bouquet {
    private Long id;
    private String name;
    private String imageName;
    private String description;
    private double price;
    private boolean customizable;

    // Constructors
    public Bouquet() {}

    public Bouquet(Long id, String name, String imageName, String description, double price, boolean customizable) {
        this.id = id;
        this.name = name;
        this.imageName = imageName;
        this.description = description;
        this.price = price;
        this.customizable = customizable;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getImageName() { return imageName; }
    public void setImageName(String imageName) { this.imageName = imageName; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public boolean isCustomizable() { return customizable; }
    public void setCustomizable(boolean customizable) { this.customizable = customizable; }
}