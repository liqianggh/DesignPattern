package cn.mycookies.test22visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 代码参考：慕课网
 * 案例： 慕课网有两种课程，收费&免费课程；用户访问时收费课程展示name和price，
 * 而免费课程只展示name
 *
 * @author Jann Lee
 * @date 2019-08-28 0:32
 **/
public class Client {

    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setPrice(999);
        codingCourse.setName("Java并发编程实战");

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("Java基础");
        freeCourse.setPrice(10);

        courses.add(freeCourse);
        courses.add(codingCourse);

        for(Course course: courses){
            course.accept(new Visitor());
        }
    }
}
