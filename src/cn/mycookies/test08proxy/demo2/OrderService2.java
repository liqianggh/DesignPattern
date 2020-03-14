package cn.mycookies.test08proxy.demo2;

/**
 * 订单服务
 *
 * @author cruder
 * @date 2019-11-23 15:42
 **/
public class OrderService2 {
    /**
     * 保存订单接口
     */
    public void saveOrder(String orderInfo) throws InterruptedException {

        long start = System.currentTimeMillis();

        // 随机休眠，模拟订单保存需要的时间
        Thread.sleep(System.currentTimeMillis() & 100);
        System.out.println("订单：" + orderInfo + "  保存成功");

        System.out.println("保存订单用时: " + (System.currentTimeMillis() - start) + "ms");
    }
}
