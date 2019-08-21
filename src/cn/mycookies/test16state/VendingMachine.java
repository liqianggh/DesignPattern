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
    public final State soldOut = new SoldOutState(this);
    public final State sold = new SoldState(this);
    public final State moneyLess = new MoneyLessState(this);
    public final State moneyEnough = new MoneyEnoughState(this);

    /**
     * 当前状态
     */
    private State state = soldOut;

    /**
     * 商品数量
     */
    private int productCount;

    public VendingMachine(int productCount) {
        this.productCount = productCount;
        if(productCount > 0) {
            state = moneyLess;
        }
    }


    /**
     * 投入硬币
     */
    public void insertCoins(){
        state.insertCoins();
    }

    /**
     * 退还硬币
     */
    public void ejectCoins(){
        state.ejectCoins();
    }

    /**
     * 选择购买商品
     */
    public void selectProduct(){
        state.selectProduct();
        state.dispence();
    }

    public void dispenseProduct(){
        if (productCount!= 0) {
            productCount--;
        }
        System.out.println("售卖机出货成功， 欢迎下次再来");
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
}
