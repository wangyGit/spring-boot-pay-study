package com.wy;

import javax.sound.midi.SoundbankResource;

public class Clone implements Cloneable{

    /*原型模式包含以下主要角色。
    抽象原型类：规定了具体原型对象必须实现的接口。
    具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。
    访问类：使用具体原型类中的 clone() 方法来复制新的对象。*/

    private String name;
    private String info;
    private String college;

    public Clone(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("模型创建成功");
    }

    public Clone(){

    }

    public void display(){
        System.out.println(name+info+college);
    }

    //通过实现implements Cloneable下的clone方法，对之前所创建的对象进行了clone.
    public Object clone() throws CloneNotSupportedException {
        System.out.println("模型拷贝成功");
        return  Clone.super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
