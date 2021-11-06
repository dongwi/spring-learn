package com.dong.ch08.bean;

import org.springframework.beans.factory.annotation.Value;

public class Desktop {
    @Value("Cheers")
    private String brand;
    // spring el expression
    @Value("#{20-1}")
    private int length;
    @Value(value = "${desktop.width}")
    private int width;

    public Desktop() {
    }

    public Desktop(String brand, int length, int width) {
        this.brand = brand;
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "brand='" + brand + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
