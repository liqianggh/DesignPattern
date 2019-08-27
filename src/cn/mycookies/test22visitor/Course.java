package cn.mycookies.test22visitor;

/**
 * 课程抽象类
 *
 * @author Jann Lee
 * @date 2019-08-28 0:23
 **/
public abstract class Course {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(IVisitor visitor);
}
