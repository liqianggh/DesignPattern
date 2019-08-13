package cn.mycookies.test07facade;

/**
 * 校验服务
 *
 * @author liqiang
 * @datetime 2019/8/13 20:25
 **/
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验"+pointsGift.getName()+"积分资格通过，库存通过");
        return true;
    }
}
