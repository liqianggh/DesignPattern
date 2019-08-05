package cn.mycookies.test03factory.factorymethod;

/**
 * 工厂模式-抽象工厂测试
 *
 * @author Jann Lee
 * @date 2019-07-28 23:00
 **/
public class Client {
    private PizzaFactory pizzaFactory;

    public Client(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza getPizza(){
        return pizzaFactory.createPizza();
    }
}
