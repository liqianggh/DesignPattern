package cn.mycookies.test09decorator.v1;

import cn.mycookies.test09decorator.v2.Pancake;

/**
 * @author Jann Lee
 * @date 2019-08-15 1:20
 **/
public class PancakeWithEgg extends Pancake {

    @Override
    public String getDesc() {
        return super.getDesc() +" 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
