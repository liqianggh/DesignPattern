package cn.mycookies.test09decorator.v1;

/**
 * @author Jann Lee
 * @date 2019-08-15 1:21
 **/
public class PancakeWithEggSausage extends PancakeWithEgg {

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
