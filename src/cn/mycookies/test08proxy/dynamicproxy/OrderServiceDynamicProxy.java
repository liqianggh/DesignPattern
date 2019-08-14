package cn.mycookies.test08proxy.dynamicproxy;

import cn.mycookies.test08proxy.Order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理，被代理类必须实现一个接口[原因：生成的代理类会继承Proxy类，因为java只能单继承，想要覆盖被代理类方法只能实现一个接口]
 *
 *
 *
 * @author Jann Lee
 * @date 2019-08-15 0:03
 **/
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;


    public OrderServiceDynamicProxy(Object orderService) {
        this.target = orderService;
    }

    /**
     * 生成一个代理对象
     * @return
     */
    public Object bind(){
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Order order = (Order) args[0];

        beforeInvoke(order);
        method.invoke(target, args);
        afterInvoke(order);
        return null;
    }


    public void beforeInvoke(Order order){
        System.out.println("beforeInvoke,order信息："+order.getOrderInfo());
    }

    public void afterInvoke(Order order){
        System.out.println("afterInvoke,order信息："+order.getOrderInfo());
    }
}
