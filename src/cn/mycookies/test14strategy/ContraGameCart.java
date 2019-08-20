package cn.mycookies.test14strategy;

/**
 * 魂斗罗游戏卡
 *
 * @author Jann Lee
 * @date 2019-08-21 0:19
 **/
public class ContraGameCart implements GameCard{
    @Override
    public void load() {
        System.out.println("魂斗罗游戏加载成功....");
    }
}
