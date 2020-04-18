package com.wy.agency;

public class test {

  /*  public static void main(String[] args) {
        staticProxy proxy = new staticProxy();
        proxy.buyHose();
    }*/


        public static void main(String[] args) {
            absAgency absagency = new Agency();
            dynamicProxy dyproxy = new dynamicProxy();
            //获取代理对象，因为挂在接口absAgency下，所以声明代理对象absAgency
            absAgency agency = (absAgency) dyproxy.getProxy(absagency);
            agency.buyHose();
        }
}
