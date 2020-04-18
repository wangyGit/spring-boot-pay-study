package com.wy.agency;

//代理模式中的具体类.
public class Agency implements absAgency{
    @Override
    public void buyHose() {
        System.out.println("买了一个房子");
    }
}
