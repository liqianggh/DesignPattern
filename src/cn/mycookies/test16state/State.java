package cn.mycookies.test16state;

/**
 * 状态接口
 *
 * @author Jann Lee
 * @date 2019-08-21 1:14
 **/
public interface State {

    /**
     * 投入硬币
     */
    void insertCoins();

    /**
     * 退还硬币
     */
    void ejectCoins();

    /**
     * 选择购买商品
     */
    void selectProduct();

    /**
     * 出货
     */
    void dispence();
}
