package cn.mycookies.test04builder;

/**
 * 房子
 *
 * @author Jann Lee
 * @date 2019-08-06 22:53
 **/
public class House {

    private String base;

    private String floor;

    private String wall;

    private String roof;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" + "base='" + base + '\'' + ", floor='" + floor + '\'' + ", wall='" + wall + '\'' + ", roof='" + roof + '\'' + '}';
    }
}
