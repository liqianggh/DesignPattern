package cn.mycookies.test05prototype;

/**
 * 正方形
 *
 * @author liqiang
 * @datetime 2019/8/13 10:45
 **/
public class Square extends Shape{
    public Square() {
        super.type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
