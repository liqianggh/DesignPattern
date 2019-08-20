package cn.mycookies.test16state;

/**
 * 余额不足状态
 *
 * @author Jann Lee
 * @date 2019-08-21 1:17
 **/
public class MoneyLessState implements State{

    @Override
    public void insertCoins() {
        System.out.println("投入"+num+"个硬币， 当前余额："+super.coinNum);
     }

    @Override
    public void ejectCoins() {
        System.out.println(coinNum + "个硬币已退还，请收好");
    }

    @Override
    public void selectProduct() {
        System.out.println("已选择商品, 但余额不足，请投币");
    }

    @Override
    public void dispence() {
        System.out.println("商品已售出，请注意查收");
    }
}
