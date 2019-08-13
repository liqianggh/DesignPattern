package cn.mycookies.test07facade;

/**
 * @author liqiang
 * @datetime 2019/8/13 20:30
 **/
public class ShippingService {

    public String shipGift(PointsGift pointsGift) {
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippintNo = "666";
        return shippintNo;
    }
}
