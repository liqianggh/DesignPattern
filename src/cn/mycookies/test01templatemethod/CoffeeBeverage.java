package cn.mycookies.test01templatemethod;

/**
 * 一杯加糖咖啡
 *
 * @author Jann Lee
 * @date 2019-07-14 18:49
 **/
public class CoffeeBeverage extends CafeineBeverage{

    @Override
    protected void brew() {
        System.out.println("冲泡咖啡...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加糖...");
    }
}
