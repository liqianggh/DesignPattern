package cn.mycookies.test16state;

/**
 * 自动贩卖机
 * 假设又一台贩卖机，里面售卖各种商品价格均为5元。贩卖机状态可分为以下集中
 * 1. 贩卖机可执行四种操作：投入硬币-退出硬币-选择购买商品-出货
 * 2. 贩卖机内部状态可分为四种：1. 有5元，2.没有5元，3.商品售罄，4.售出商品
 *
 * @author Jann Lee
 * @date 2019-08-21 1:01
 **/
public class VendingMachine {
    final static int SOLD_OUT = 0;
    final static int MONEY_LESS = 1;
    final static int MONEY_ENOUGH = 2;
    final static int SOLD = 3;

    private int state = SOLD_OUT;

    /**
     * 投入硬币
     * @param num 硬币个数
     */
    public void insertCoins(int num){

    }

    /**
     * 退还硬币
     */
    public void ejectCoins(){

    }

    /**
     * 选择购买商品
     */
    public void selectProduct(){

    }

    /**
     * 出货
     */
    public void dispence(){

    }

}
