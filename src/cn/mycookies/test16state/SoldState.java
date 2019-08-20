package cn.mycookies.test16state;

/**
 * 商品已售出
 *
 * @author Jann Lee
 * @date 2019-08-21 1:17
 **/
public class SoldState implements State{

    @Override
    public void insertCoins() {
        System.out.println("请稍等，我们已经");
     }

    @Override
    public void ejectCoins() {
        System.out.println( "个硬币已退还，请收好");

    }

    @Override
    public void selectProduct() {
        System.out.println("已选择商品");
        dispence();
    }

    @Override
    public void dispence() {
        System.out.println("商品已售出，请注意查收");
    }
}
