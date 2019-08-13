package cn.mycookies.test07facade;

/**
 * 支付service
 *
 * @author liqiang
 * @datetime 2019/8/13 20:27
 **/
public class PointsPaymentService {

    public boolean pay(PointsGift pointsGift) {
        // 扣减积分
        System.out.println("支付"+ pointsGift.getName() +"积分成功");
        return true;
    }
}
