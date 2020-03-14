package cn.mycookies.test08proxy.demo2;

import cn.mycookies.test08proxy.utils.ProxyUtils;

/**
 * 使用代理类来保存订单
 *
 * @author Cruder
 * @date 2019-11-23 15:49
 **/
public class Client {
    public static void main(String[] args) throws InterruptedException {
        InvocationHandlerImpl invocationHandler  = new InvocationHandlerImpl(new OrderService());
        IOrderService orderService = (IOrderService) invocationHandler.getProxyInstance();
        String saveFileName = "OrderServiceDynamicProxy.class";
        ProxyUtils.saveProxyClass(saveFileName, orderService.getClass().getSimpleName(), new Class[]{IOrderService.class});
        orderService.saveOrder(" Cruder 新买的花裤衩 ");
    }
}
