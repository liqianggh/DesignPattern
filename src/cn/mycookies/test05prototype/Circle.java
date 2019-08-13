package cn.mycookies.test05prototype;

/**
 * 具体原型类
 *
 * @author liqiang
 * @datetime 2019/8/13 10:04
 **/
public class Circle extends Shape {

    public Circle() {
        super.type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
