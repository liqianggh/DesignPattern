package cn.mycookies.test03factory.factorymethod.vegetable;

import cn.mycookies.test03factory.factorymethod.Pizza;
import cn.mycookies.test03factory.factorymethod.PizzaFactory;

/**
 * 蔬菜pizza工厂类
 *
 * @author Jann Lee
 * @date 2019-07-28 23:14
 **/
public class VegetablePizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza() {
        return new VegetablePizza();
    }
}
