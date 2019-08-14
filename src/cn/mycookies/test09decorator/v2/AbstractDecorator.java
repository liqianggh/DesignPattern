package cn.mycookies.test09decorator.v2;

/**
 * 抽象装饰器
 * 是否抽象决定是否要有抽象方法
 * @author Jann Lee
 * @date 2019-08-15 1:25
 **/
public abstract class AbstractDecorator extends AbstractPancake{

    private AbstractPancake abstractPancake;

    public AbstractDecorator(AbstractPancake abstractPancake) {
        this.abstractPancake = abstractPancake;
    }

    @Override
    protected String getDesc() {
        return this.abstractPancake.getDesc();
    }

    @Override
    protected int cost() {
        return this.abstractPancake.cost();
    }
}
