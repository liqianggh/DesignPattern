package cn.mycookies.test16state;

/**
 * 商品已售出
 *
 * @author Jann Lee
 * @date 2019-08-21 1:17
 **/
public class SoldState implements State{

    VendingMachine vendingMachine;

    public SoldState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoins() {
        System.out.println("请稍等，商品正在出货中，请不要投币");
     }

    @Override
    public void ejectCoins() {
        System.out.println( "对不起，商品已出货，不能退款,请耐心等待");

    }

    @Override
    public void selectProduct() {
        System.out.println("你已经选择了商品，不能再选了");
    }

    @Override
    public void dispence() {
        vendingMachine.dispenseProduct();
        if (vendingMachine.getProductCount() > 0) {
            vendingMachine.setState(vendingMachine.moneyLess);
        } else {
            vendingMachine.setState(vendingMachine.soldOut);
        }
    }
}
