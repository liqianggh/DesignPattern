package cn.mycookies.test02singleton.type01;


/**
 * 饿汉式[静态代码块]
 *
 * @author Jann Lee
 * @date 2019-07-21 16:40
 */
public class Singleton2 {

    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}

