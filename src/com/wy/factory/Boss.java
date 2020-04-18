package com.wy.factory;

public class Boss {

    public static void main(String[] args) {
        //抽象工厂 = 具体工厂 
        Drive audifactory = new audiFactory();
        //具体工厂根据抽象对象生产具体对象。
        Car audi =  audifactory.creatCar("audi");

        audi.drive();

    }
}
