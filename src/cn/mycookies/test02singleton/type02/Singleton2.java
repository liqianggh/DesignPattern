package cn.mycookies.test02singleton.type02;

/**
 * 懒汉式[同步方法]
 *
 * @author Jann Lee
 * @date 2019-07-21 14:33
 **/
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {
    }

    /**
     * 同步方法，保证线程安全
     */
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
