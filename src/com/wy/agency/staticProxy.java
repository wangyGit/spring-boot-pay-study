package com.wy.agency;

import javax.sound.midi.SoundbankResource;

//代理模式中的 代理类.
public class staticProxy implements absAgency{
    absAgency absagency;
    @Override
    public void buyHose() {
        absagency = new Agency();
        seeHose();
        absagency.buyHose();
        pay();
    }

    public void seeHose(){
        System.out.println("看了一个房子");
    }

    public void pay(){
        System.out.println("付款");
    }

}
