package cn.mycookies.test04builder;

/**
 * 普通房子
 *
 * @author Jann Lee
 * @date 2019-08-06 23:39
 **/
public class CommonHouseBuilder extends HouseBuilder {

    @Override
    protected void buildBase() {
        super.house.setBase("地基1m");
        System.out.println("地基1m");
    }

    @Override
    protected void buildWall() {
        super.house.setWall("围墙14cm");
        System.out.println("围墙14cm");
    }

    @Override
    protected void roofed() {
        super.house.setRoof("混凝土屋顶");
        System.out.println("混凝土屋顶");
    }

}
