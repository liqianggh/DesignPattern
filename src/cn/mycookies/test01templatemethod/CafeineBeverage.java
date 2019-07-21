package cn.mycookies.test01templatemethod;

/**
 * 咖啡因饮料
 *
 * @author Jann Lee
 * @date 2019-07-14 18:43
 **/
public abstract class CafeineBeverage {
    /**
     * 制作一杯咖啡因饮料
     */
    public void prepareRecipe() {
        boilWater();
        brew();
        portInCup();
        addCondiments();
    }

    /**
     * step1: 烧水
     */
    private void boilWater() {
        System.out.println("烧水...");
    }

    /**
     * step2：冲泡
     */
    protected abstract void brew();

    /**
     * step3: 入杯中
     */
    private void portInCup() {
        System.out.println("倒入杯中...");
    }

    /**
     * step4: 加调料
     */
    protected abstract void addCondiments();
}
