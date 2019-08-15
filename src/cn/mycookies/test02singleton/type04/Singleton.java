package cn.mycookies.test02singleton.type04;

/**
 * 枚举实现单例模式
 *
 * @author Jann Lee
 * @date 2019-07-21 14:55
 **/
public enum Singleton {

    INSTANCE("Jann", 23);

    private String name;

    private int age;

    Singleton(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

