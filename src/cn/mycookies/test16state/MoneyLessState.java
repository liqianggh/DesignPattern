package cn.mycookies.test16state;

/**
 * 余额不足状态
 *
 * @author Jann Lee
 * @date 2019-08-21 1:17
 **/
public class MoneyLessState implements State{
    VendingMachine vendingMachine;

    public MoneyLessState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoins() {
        System.out.println("已投入硬币，快选择商品吧");
        vendingMachine.setState(vendingMachine.moneyEnough);
     }

    @Override
    public void ejectCoins() {
        System.out.println("您还没有投币");
    }

    @Override
    public void selectProduct() {
        System.out.println("已选择商品, 但余额不足，请投币");
    }

    @Override
    public void dispence() {
        System.out.println("您还没有投币, 请先投币");
    }
}
