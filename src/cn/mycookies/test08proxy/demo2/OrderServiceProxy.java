package cn.mycookies.test08proxy.demo2;


/**
 * 2. 创建代理类，实现订单服务接口
 *
 * @author Jann Lee
 * @date 2019-11-23 16:01
 **/
public class OrderServiceProxy implements IOrderService{
    /**
     * 内部持有真实的订单服务对象，保存订单工作实际由它来完成
     */
    private IOrderService orderService;


    @Override
    public void saveOrder(String orderInfo) throws InterruptedException {
        /**
         * 延迟初始化，也可以创建代理对象时就创建，或者作为构造参数传进来
         * 仅作为代码实例，不考虑线程安全问题
         */
        if (orderService == null) {
            orderService = new OrderService();
        }

        long start = System.currentTimeMillis();
        orderService.saveOrder(orderInfo);
        System.out.println("保存订单用时: " + (System.currentTimeMillis() - start) + "ms");
    }
}
