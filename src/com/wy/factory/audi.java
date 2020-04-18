package com.wy.factory;

public class audi extends Car{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void drive() {
        System.out.println("生产一台"+this.getName());
    }
}
