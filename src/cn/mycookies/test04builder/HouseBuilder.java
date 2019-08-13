package cn.mycookies.test04builder;

/**
 * 抽象的构造器
 *
 * @author Jann Lee
 * @date 2019-08-06 22:53
 **/
public abstract class HouseBuilder {

    protected House house = new House();

    /**
     * 打地基
     */
    protected abstract void buildBase();

    /**
     * 铺地板
     */
    public void buildFloor(){
        house.setFloor("铺地板");
        System.out.println("铺地板");
    }

    /**
     * 修围墙
     */
    protected abstract void buildWall();

    /**
     * 封顶
     */
    protected abstract void roofed();

    /**
     * 构建房子
     * @return
     */
    public House buildHouse(){
        return house;
    }
}
