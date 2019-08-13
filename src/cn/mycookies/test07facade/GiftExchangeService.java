package cn.mycookies.test07facade;

/**
 * @author liqiang
 * @datetime 2019/8/13 20:32
 **/
public class GiftExchangeService {
    private QualifyService qualifyService;
    private PointsPaymentService pointsPaymentService;
    private ShippingService shippingService;

    /**
     * 模拟spring，创建时依赖对象已经注入
     */
    public GiftExchangeService() {
        this.qualifyService = new QualifyService();
        this.pointsPaymentService = new PointsPaymentService();
        this.shippingService = new ShippingService();
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            if (pointsPaymentService.pay(pointsGift)) {
                shippingService.shipGift(pointsGift);
            }
        }
    }
}
