package cn.mycookies.test02singleton.type02;

/**
 * 懒汉式[非线程安全]
 *
 * @author Jann Lee
 * @date 2019-07-21 14:31
 **/
public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
