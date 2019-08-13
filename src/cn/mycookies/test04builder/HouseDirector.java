package cn.mycookies.test04builder;

/**
 * 指挥者
 *
 * @author Jann Lee
 * @date 2019-08-06 23:36
 **/
public class HouseDirector {

    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House build(){
        houseBuilder.buildBase();
        houseBuilder.buildFloor();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }

}
