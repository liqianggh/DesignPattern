package cn.mycookies.test02singleton.type03;

/**
 * 使用静态内部类实现单例模式
 *
 * @author Jann Lee
 * @date 2019-07-21 14:47
 **/
public class Singleton {

    private Singleton (){}

    public static Singleton getInstance() {
        return InstanceHolder.singleton;
    }

    /**
     * Singleton装载完成后，不会创建对象
     * 调用getInstance时候，静态内部类ClassHolder才进行装载
     */
    private static class InstanceHolder {
       private static final Singleton singleton = new Singleton();
    }
}
