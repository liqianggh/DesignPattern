package cn.mycookies.test22visitor;

/**
 * @author Jann Lee
 * @date 2019-08-28 0:27
 **/
public class Visitor implements IVisitor {

    @Override
    public void visit(FreeCourse course) {
        System.out.println("免费课程："+course.getName());
    }

    @Override
    public void visit(CodingCourse course) {
        System.out.println("收费课程："+course.getName() + " ， 价格 "+ course.getPrice() );
    }
}
