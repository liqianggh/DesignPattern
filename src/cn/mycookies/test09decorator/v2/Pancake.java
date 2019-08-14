package cn.mycookies.test09decorator.v2;

/**
 * 煎饼类
 *
 * @author Jann Lee
 * @date 2019-08-15 1:18
 **/
public class Pancake extends AbstractPancake {
    @Override
    public String getDesc(){
        return "煎饼";
    }

    @Override
    public int cost(){
        return 8;
    }
}
