package com.wy.build;


//建造者中的具体建造者，负责实现抽象建造者中的接口方法，来建造组件.
public class Build implements absBuild{
   private Product product = new Product();
    @Override
    public void buildSofa() {
        product.setSofa("沙发");
    }

    @Override
    public void buildTelevision() {
        product.setTelevision("电视");
    }

    @Override
    public void buildChest() {
        product.setChest("桌子");
    }

    @Override
    public void buildChair() {
        product.setChair("椅子");
    }

    @Override
    public String getName(){
        return product.getChest()+product.getChair()+product.getSofa()+product.getTelevision();
    }

}
