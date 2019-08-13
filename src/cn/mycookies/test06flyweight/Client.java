package cn.mycookies.test06flyweight;

/**
 * @author liqiang
 * @datetime 2019/8/13 19:35
 **/
public class Client {

    public static final String[] departments = {"RD","QA","PM", "BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
