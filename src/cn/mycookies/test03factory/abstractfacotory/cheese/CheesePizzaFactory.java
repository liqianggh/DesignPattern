package cn.mycookies.test03factory.abstractfacotory.cheese;

import cn.mycookies.test03factory.abstractfacotory.Pizza;
import cn.mycookies.test03factory.abstractfacotory.PizzaFactory;

/**
 * 芝士pizza的工厂类， 用来创建芝士pizza
 *
 * @author Jann Lee
 * @date 2019-07-28 23:12
 **/
public class CheesePizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return  new CheesePizza();
    }
}
