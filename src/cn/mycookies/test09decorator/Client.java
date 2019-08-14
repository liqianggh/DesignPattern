package cn.mycookies.test09decorator;

import cn.mycookies.test09decorator.v1.PancakeWithEgg;
import cn.mycookies.test09decorator.v1.PancakeWithEggSausage;
import cn.mycookies.test09decorator.v2.AbstractPancake;
import cn.mycookies.test09decorator.v2.Pancake;
import cn.mycookies.test09decorator.v2.EggDecorator;
import cn.mycookies.test09decorator.v2.SansageDecorator;
import org.junit.Test;

/**
 * @author Jann Lee
 * @date 2019-08-15 1:29
 **/
public class Client {

    @Test
    public void testFakeDecorator() {
        // 加1个鸡蛋
        Pancake pancakeWithEgg  = new PancakeWithEgg();
        // 加一个鸡蛋再加一根香肠
        Pancake pancakeWithEggSausage= new PancakeWithEggSausage();
        System.out.println(pancakeWithEgg.getDesc() + "价格：" +pancakeWithEgg.cost() +"元");
        System.out.println(pancakeWithEggSausage.getDesc() + "价格：" +pancakeWithEggSausage.cost() +"元");

    }

    @Test
    public void testRealDecorator() {
        AbstractPancake pancake = new Pancake();
        // 加2个鸡蛋
        pancake = new EggDecorator(pancake);
        pancake = new EggDecorator(pancake);
        // 再加一根香肠
        SansageDecorator result= new SansageDecorator(pancake);
        System.out.println(result.getDesc() + "价格：" +result.cost() +"元");
    }
}
