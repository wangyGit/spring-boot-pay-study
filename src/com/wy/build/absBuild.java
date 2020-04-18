package com.wy.build;

public interface absBuild {

    //建造者中 抽象建造者角色. 负责定义各个组件的方法接口.

    public void buildSofa();
    public void buildTelevision();
    public void buildChest();
    public void buildChair();
    public String getName();
}
