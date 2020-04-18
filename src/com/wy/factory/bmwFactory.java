package com.wy.factory;

public class bmwFactory extends Drive{

    @Override
    public Car creatCar(String car_name) {
        Car bmw = new bmw();
        bmw.setName(car_name);
        return bmw;
    }
}
