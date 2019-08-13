package cn.mycookies.test03factory.abstractfactory.basic;

/**
 * 联想内存
 *
 * @author Jann Lee
 * @date 2019-08-05 23:04
 **/
public class LenovoRam {

    private int size;

    private String name;

    public LenovoRam(int size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public String toString() {
        return "内存：" + name + "-" + size;
    }
}
