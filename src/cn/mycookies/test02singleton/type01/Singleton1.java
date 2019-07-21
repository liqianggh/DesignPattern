package cn.mycookies.test02singleton.type01;

/**
 * 饿汉式[静态变量]
 *
 * @author Jann Lee
 * @date 2019-07-21 14:28
 */
public class Singleton1 {

    private static final Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }
}
