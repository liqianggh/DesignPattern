package cn.mycookies.test05prototype;

/**
 * @author liqiang
 * @datetime 2019/8/13 10:41
 **/
public class Rectangle extends Shape {
    public Rectangle() {
        super.type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
