package cn.mycookies.test01_template_method;

/**
 * 一杯柠檬茶
 *
 * @author Jann Lee
 * @date 2019-07-14 18:26
 **/
public class Tea {

    /**
     * 制作一杯柠檬茶
     */
    public void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        portInCup();
        addSugarAndMilk();
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
    private void brewCoffeeGrinds() {
        System.out.println("冲泡茶包...");
    }

    /**
     * step3: 倒入杯中
     */
    private void portInCup() {
        System.out.println("倒入杯中...");
    }

    /**
     * step4: 加柠檬
     */
    private void addSugarAndMilk() {
        System.out.println("加入柠檬片...");
    }
}
