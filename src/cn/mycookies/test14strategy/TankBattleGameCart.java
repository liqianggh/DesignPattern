package cn.mycookies.test14strategy;

/**
 * 坦克大战游戏卡
 *
 * @author Jann Lee
 * @date 2019-08-21 0:22
 **/
public class TankBattleGameCart implements GameCard{
    @Override
    public void load() {
        System.out.println("坦克大战游戏加载成功....");
    }
}
