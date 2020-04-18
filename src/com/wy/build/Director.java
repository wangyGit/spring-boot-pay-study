package com.wy.build;

//建造者中的调用者，调用建造者中的具体模块，来组成product产品.
public class Director {

    public static void main(String[] args) {
        absBuild build = new Build();
        build.buildSofa();
        build.buildChair();
        build.buildChest();
        build.buildTelevision();
        System.out.println("家里构建有："+ build.getName());
    }
}
