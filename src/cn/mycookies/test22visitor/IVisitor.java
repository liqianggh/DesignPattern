package cn.mycookies.test22visitor;

/**
 * @author Jann Lee
 * @date 2019-08-28 0:25
 **/
public interface IVisitor {
    void visit(FreeCourse course);

    void visit(CodingCourse course);

}
