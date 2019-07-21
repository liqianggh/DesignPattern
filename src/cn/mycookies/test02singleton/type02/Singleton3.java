package cn.mycookies.test02singleton.type02;

/**
 * 懒汉式[同步代码块]
 *
 * @author Jann Lee
 * @date 2019-07-21 14:38
 **/
public class Singleton3 {

    private static Singleton3 instance;

    private Singleton3() {
    }

    /**
     * 同步代码块，并不能保证线程安全
     */
    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                instance = new Singleton3();
            }
        }
        return instance;
    }
}
