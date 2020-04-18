package com.wy;

/**
 * 单例模式
 * 单例模式有 3 个特点：
 *     单例类只有一个实例对象；
 *     该单例对象必须由单例类自行创建；
 *     单例类对外提供一个访问该单例的全局访问点；
 */
public class Singleton {
    //懒汉式 多线程的线程池，数据库连接池 网站计数器，windows回收站，任务管理器，web应用的配置对象。
    //volatile可见性，指一个线程修改的状态对另一个线程是可加性的。
    private static volatile Singleton singleton = null;
    private Singleton(){} //私有化构造方法，防止外部new
    //static修饰的变量属于类变量.可以通过类名.变量名直接引用，而不需要new出一个类来
    //被static修饰的方法属于类方法，可以通过类名.方法名直接引用，而不需要new出一个类来
    public static synchronized Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
    //饿汉式
    public static Singleton getInstance2(){
        return singleton;
    }
}
