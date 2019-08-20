package cn.mycookies.test16state;

/**
 * 售罄状态
 *
 * @author Jann Lee
 * @date 2019-08-21 1:17
 **/
public class SoldOutState extends State{

    VendingMachine vendingMachine;

    public SoldOutState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoins(int num) {
        coinNum += coinNum;
        System.out.println("你不能继续投币， 商品已售罄");


     }

    @Override
    public void ejectCoins() {
        System.out.println("您还没有投币");
    }

    @Override
    public void selectProduct() {
        System.out.println("商品已售罄");
        ejectCoins();
    }

    @Override
    public void dispence() {
        System.out.println("商品已售罄");
    }
}
