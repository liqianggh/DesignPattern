package cn.mycookies.test02singleton.type04;

/**
 * 枚举实现单例模式
 *
 * @author Jann Lee
 * @date 2019-07-21 14:55
 **/
public enum Singleton {

    INSTANCE;

    private String name;

    private int age;

    Singleton() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

