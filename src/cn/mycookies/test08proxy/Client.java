package cn.mycookies.test08proxy;

import cn.mycookies.test08proxy.dynamicproxy.OrderServiceDynamicProxy;
import cn.mycookies.test08proxy.staticproxy.OrderServiceStaticProxy;
import cn.mycookies.test08proxy.utils.ProxyUtils;
/**
 * 动态代理和静态代理测试
 *
 * @author Jann Lee
 * @date 2019-08-15 0:00
 **/
public class Client {
    static Order order;
    static {
        order = new Order();
        order.setOrderInfo("订单信息");
        order.setUserId(123);
    }

    public static void main(String[] args) {
        staticProxyTest();
    }

    public static void staticProxyTest(){
        OrderServiceStaticProxy proxy = new OrderServiceStaticProxy();
        proxy.saveOrder(order);
    }
    public static void dynamicProxyTest(){
        IOrderService proxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        // *****************************生成一个$Proxy0.class文件，这个文件即为动态生成的代理类文件**********************************
        String saveFileName = "$Proxy0.class";
        ProxyUtils.saveProxyClass(saveFileName, proxy.getClass().getSimpleName(),new Class[]{IOrderService.class});
        // *****************************此区间代码可以忽略，仅为了观察java动态代理生成的类**********************************
        proxy.saveOrder(order);
    }
}
