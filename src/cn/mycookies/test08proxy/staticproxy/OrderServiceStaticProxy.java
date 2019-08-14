package cn.mycookies.test08proxy.staticproxy;

import cn.mycookies.test08proxy.IOrderService;
import cn.mycookies.test08proxy.Order;
import cn.mycookies.test08proxy.OrderServiceImpl;

/**
 * @author Jann Lee
 * @date 2019-08-14 22:11
 **/
public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public OrderServiceStaticProxy() {
        iOrderService = new OrderServiceImpl();
    }

    public void saveOrder(Order order) {
        beforeMethod();
        iOrderService.saveOrder(order);
        afterMethod();
    }

    private void afterMethod() {
        System.out.println("saveOrder执行之后执行。。。。。");
    }

    private void beforeMethod() {
        System.out.println("saveOrder执行之前执行。。。。。");
    }
}
