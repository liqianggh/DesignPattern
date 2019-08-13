package cn.mycookies.test07facade;

/**
 * @author liqiang
 * @datetime 2019/8/13 20:38
 **/
public class Client {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();

        giftExchangeService.giftExchange(pointsGift);
    }
}
