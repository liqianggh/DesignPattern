package cn.mycookies.test02singleton.type02;

/**
 * 懒汉式[双重检查]
 *
 * @author Jann Lee
 * @date 2019-07-21 14:40
 **/
public class Singleton4 {

    private static volatile Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

}
