package cn.mycookies.test08proxy.demo2;

/**
 * 1. 定义接口，为了使代理被代理对象看起来一样。当然这一步完全可以省略
 *
 * @author Jann Lee
 * @date 2019-11-23 15:58
 **/
public interface IOrderService {
    /**
     * 保存订单接口
     * @param orderInfo 订单信息
     */
    void saveOrder(String orderInfo) throws InterruptedException;
}
