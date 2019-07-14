package cn.mycookies.test01_template_method;

/**
 * 一杯加糖咖啡
 *
 * @author Jann Lee
 * @date 2019-07-14 18:37
 */
public class Coffee {

    /**
     * 制作一杯加糖咖啡
     */
    public void prepareRecipe() {
        boilWater();
        steepTeaBag();
        portInCup();
        addLemon();
    }

    /**
     * step1: 烧水
     */
    private void boilWater() {
        System.out.println("烧水...");
    }

    /**
     * step2：冲泡咖啡
     */
    private void steepTeaBag() {
        System.out.println("冲泡咖啡...");
    }

    /**
     * step3: 倒入杯中
     */
    private void portInCup() {
        System.out.println("倒入杯中...");
    }

    /**
     * step4: 加糖
     */
    private void addLemon() {
        System.out.println("加糖...");
    }
}
