package cn.mycookies.test05prototype;

import java.util.Hashtable;

/**
 * 用来缓存原型对象
 *
 * @author liqiang
 * @datetime 2019/8/13 10:54
 **/
public class ShapeCache {

    private static Hashtable<Integer, Shape> shapeMap
            = new Hashtable<Integer, Shape>();

    public static Shape getShape(Integer id) {
        // 根据条件找到要创建对象的原型
        Shape cachedShape = shapeMap.get(id);
        // 复制一个原型，返回
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId(1);
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId(2);
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId(3);
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
