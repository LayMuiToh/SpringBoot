package com.frankmoley.landon.data.entity;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
    String id;
    String brand;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void compile()
    {
        System.out.println("Compiling...");
    }
}
