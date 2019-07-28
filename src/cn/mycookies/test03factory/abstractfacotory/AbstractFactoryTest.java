package cn.mycookies.test03factory.abstractfacotory;
import cn.mycookies.test03factory.abstractfacotory.cheese.CheesePizza;

/**
 * 工厂模式-抽象工厂
 *
 * @author Jann Lee
 * @date 2019-07-28 23:00
 **/
public class AbstractFactoryTest {
    private PizzaFactory pizzaFactory;

    /**
     * 第一种，new方式实现
     */
    public CheesePizza getCheesePizza(){
        return new CheesePizza();
    }

    /**
     * 第二种，通过抽象工厂
     */
    public Pizza getCheesePizza2(){
        return pizzaFactory.createPizza();
    }
}
