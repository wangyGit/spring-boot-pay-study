package com.wy.factory;

public abstract class Drive {
    /**
     * 造车厂的抽象工厂. --> 具体工厂(audiFactory . bmwFactory . bydFactory)
     */
    public abstract Car creatCar(String car_name);
}
