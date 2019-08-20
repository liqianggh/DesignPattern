package cn.mycookies.test14strategy;

/**
 * 超级马里奥游戏卡
 *
 * @author Jann Lee
 * @date 2019-08-21 0:19
 **/
public class SuperMarioGameCart implements GameCard{
    @Override
    public void load() {
        System.out.println("超级马里奥游戏加载成功....");
    }
}
