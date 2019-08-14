package cn.mycookies.test09decorator.v2;

/**
 * @author Jann Lee
 * @date 2019-08-15 1:27
 **/
public class SansageDecorator extends AbstractDecorator {
    public SansageDecorator(AbstractPancake abstractPancake) {
        super(abstractPancake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
