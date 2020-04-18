package com.wy.factory;


public abstract class Car {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 抽象产品.car --> 具体产品（audi\bmw\byd）
     */

    public abstract void drive();
}
