package cn.mycookies.test04builder;

/**
 * 需要建房子的客户端类
 *
 * @author Jann Lee
 * @date 2019-08-07 0:04
 **/
public class Client {

    public static void main(String[] args) {
        // 创建一个构建器
        HighBuildingBuilder highBuildingBuilder = new HighBuildingBuilder();
        // 创建指挥者
        HouseDirector houseDirector = new HouseDirector(highBuildingBuilder);

        House house = houseDirector.build();
        System.out.println(house);
    }

}
