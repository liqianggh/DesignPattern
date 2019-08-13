package cn.mycookies.test03factory.abstractfactory.basic;

/**
 * 英伟达显卡
 *
 * @author Jann Lee
 * @date 2019-08-05 23:04
 **/
public class NvidiaGpu {

    private String name;

    public NvidiaGpu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "显卡：" + name ;
    }
}
