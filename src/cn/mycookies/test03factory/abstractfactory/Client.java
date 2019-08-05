package cn.mycookies.test03factory.abstractfactory;

/**
 * 需要创建电脑对象的客户类
 *
 * @author Jann Lee
 * @date 2019-08-06 0:14
 **/
public class Client {

    public static void main(String[] args) {
        AbstractComputerFactory computerFactory = new PoorPerformanceComputerFactory();
        System.out.println(computerFactory.createComputer());
    }
}
