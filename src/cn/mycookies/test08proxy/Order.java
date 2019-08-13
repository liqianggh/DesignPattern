package cn.mycookies.test08proxy;

/**
 * @author Jann Lee
 * @date 2019-08-14 0:47
 **/
public class Order {
    private Integer userId;
    private String orderInfo;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    @Override
    public String toString() {
        return "Order{" + "userId=" + userId + ", orderInfo='" + orderInfo + '\'' + '}';
    }
}
