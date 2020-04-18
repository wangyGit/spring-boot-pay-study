package com.wy.factory;

public class audiFactory extends Drive{

    @Override
    public Car creatCar(String car_name) {
        Car audi = new audi();
        audi.setName(car_name);
        return audi;
    }
}
