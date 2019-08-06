package cn.mycookies.test04builder;

/**
 * 高层建筑
 *
 * @author Jann Lee
 * @date 2019-08-06 23:39
 **/
public class HighBuildingBuilder extends HouseBuilder {

    @Override
    protected void buildBase() {
        super.house.setBase("地基50m");
        System.out.println("地基50m");
    }

    @Override
    protected void buildWall() {
        super.house.setWall("玻璃幕墙");
        System.out.println("玻璃幕墙");
    }

    @Override
    protected void roofed() {
        super.house.setRoof("透明屋顶");
        System.out.println("透明屋顶");
    }
}
