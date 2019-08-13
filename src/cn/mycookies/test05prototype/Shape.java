package cn.mycookies.test05prototype;

/**
 * 实现了cloneable的原型抽象类
 *
 * @author liqiang
 * @datetime 2019/8/13 10:00
 **/
public abstract class Shape implements Cloneable {

    protected Integer id;

    protected String type;

    public Shape() {
        System.out.println("构造方法被调用");
    }

    public abstract void draw();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 重写clone方法
     * @return
     */
    @Override
    protected Shape clone() {
        Shape prototype = null;
        try {
            prototype = (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }

}
