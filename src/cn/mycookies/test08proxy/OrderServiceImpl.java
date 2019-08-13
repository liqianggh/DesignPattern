package cn.mycookies.test08proxy;

/**
 * @author Jann Lee
 * @date 2019-08-14 0:50
 **/
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    public OrderServiceImpl() {
        // 模拟spring注入
        iOrderDao = new OrderDaoImpl();
    }

    @Override
    public int saveOrder(Order order) {
        System.out.println("Service层调用dao层添加Order"+order.getOrderInfo());
        return iOrderDao.insert(order);
    }
}
