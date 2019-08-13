package cn.mycookies.test03factory.facotorymethod;

/**
 * 披萨的父类
 *
 * @author Jann Lee
 * @date 2019-07-28 23:06
 **/
public abstract class Pizza {
    protected String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
