package com.wy.build;

public class Product {
    //建造者中的产品角色. 包含多个组成部分组件的复杂对象，由具体建造者来创建各个组件.

    private String sofa;
    private String television;
    private String chest;
    private String chair;

    public String getSofa() {
        return sofa;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    public String getTelevision() {
        return television;
    }

    public void setTelevision(String television) {
        this.television = television;
    }

    public String getChest() {
        return chest;
    }

    public void setChest(String chest) {
        this.chest = chest;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }
}
