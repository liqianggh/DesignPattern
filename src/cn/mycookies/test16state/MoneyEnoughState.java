package cn.mycookies.test16state;

/**
 * 余额充足状态
 *
 * @author Jann Lee
 * @date 2019-08-21 1:17
 **/
public class MoneyEnoughState implements State{

    VendingMachine vendingMachine;

    public MoneyEnoughState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoins() {
        System.out.println("当前余额充足，无需投币");
     }

    @Override
    public void ejectCoins() {
        System.out.println( "个硬币已退还，请收好");
        vendingMachine.setState(vendingMachine.moneyLess);
    }

    @Override
    public void selectProduct() {
        System.out.println("已选择商品");
        vendingMachine.setState(vendingMachine.sold);
    }

    @Override
    public void dispence() {
        System.out.println("商品已售出，请注意查收");
    }
}
