package cn.mycookies.test01_template_method;

/**
 * 一杯柠檬茶
 *
 * @author Jann Lee
 * @date 2019-07-14 18:47
 **/
public class TeaBeverage extends CafeineBeverage {
    @Override
    protected void brew() {
        System.out.println("冲泡茶包...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加柠檬...");
    }
}
