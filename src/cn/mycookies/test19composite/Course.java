package cn.mycookies.test19composite;

/**
 * 课程类
 *
 * @author Jann Lee
 * @date 2019-08-26 23:08
 **/
public class Course extends CatalogComponent {

    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name:" +this.name +", Course Price:"+this.price);
    }
}

