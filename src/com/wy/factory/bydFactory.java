package com.wy.factory;

public class bydFactory extends Drive{
    @Override
    public Car creatCar(String car_name) {
        Car byd = new byd();
        byd.setName(car_name);
        return byd;
    }
}
