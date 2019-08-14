package cn.mycookies.test08proxy;

import cn.mycookies.test08proxy.staticproxy.OrderServiceStaticProxy;

/**
 * @author Jann Lee
 * @date 2019-08-15 0:00
 **/
public class Client {

    public static void main(String[] args) {
        OrderServiceStaticProxy proxy = new OrderServiceStaticProxy();
        Order order = new Order();
        order.setOrderInfo("hello");
        order.setUserId(123);

        proxy.saveOrder(order);
    }
}
