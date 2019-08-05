package cn.mycookies.test03factory.abstractfactory.basic;

/**
 * 客户类， 创建一个电脑类，要创建相关的一系列对象
 *
 * @author Jann Lee
 * @date 2019-08-05 23:07
 **/
public class Client {
    public static void main(String[] args) {
        InterCpu cpu = new InterCpu("酷睿i7-9700");
        LenovoRam ram = new LenovoRam(8,"联想");
        NvidiaGpu gpu = new NvidiaGpu("英伟达 1050Ti");

        MyComputer computer = new MyComputer(cpu, ram, gpu);
        System.out.println(computer);
    }
}
