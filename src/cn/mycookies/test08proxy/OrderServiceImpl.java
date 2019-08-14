package cn.mycookies.test08proxy;

/**
 * @author Jann Lee
 * @date 2019-08-14 0:50
 **/
public class OrderServiceImpl implements IOrderService {


    @Override
    public void saveOrder(Order order) {
        System.out.println("Service层调用"+order.getOrderInfo());
    }
}
