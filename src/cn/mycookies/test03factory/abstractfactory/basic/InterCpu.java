package cn.mycookies.test03factory.abstractfactory.basic;

/**
 * 因特尔cpu
 *
 * @author Jann Lee
 * @date 2019-08-05 23:02
 **/
public class InterCpu {
    private String name;

    public InterCpu(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CPU: " + name ;
    }
}
