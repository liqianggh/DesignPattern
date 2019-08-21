package cn.mycookies.test16state;

/**
 * @author liqiang
 * @datetime 2019/8/21 16:32
 **/
public class Client {
    public static void main(String[] args) {
        // 初始化收获机，包括两件商品
        VendingMachine vendingMachine = new VendingMachine(2);
        // 没有投币
        vendingMachine.selectProduct();
        vendingMachine.ejectCoins();
        System.out.println("=====================================================");

        // 投币购买，购买后再退款
        vendingMachine.insertCoins();
        vendingMachine.selectProduct();
        vendingMachine.ejectCoins();
        System.out.println("=====================================================");

        // 投币购买
        vendingMachine.insertCoins();
        vendingMachine.selectProduct();
        System.out.println("=====================================================");

        // 商品售罄，投币购买
        vendingMachine.insertCoins();
        vendingMachine.selectProduct();
    }
}
