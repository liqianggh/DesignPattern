package cn.mycookies.test08proxy;

/**
 * @author Jann Lee
 * @date 2019-08-14 0:49
 **/
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order"+order.getOrderInfo()+"成功");
        return 0;
    }
}
