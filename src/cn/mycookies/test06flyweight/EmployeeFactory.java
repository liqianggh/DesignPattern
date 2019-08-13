package cn.mycookies.test06flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂类
 *
 * @author liqiang
 * @datetime 2019/8/13 19:32
 **/
public class EmployeeFactory {

    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department){
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null) {
            manager = new Manager(department);
            String reportContent = "此次汇报的主要内容......";
            System.out.print("创建部门经理"+manager);
            manager.setReportContent(department+"部门汇报：" + reportContent);
            System.out.println("创建报告" + reportContent);

            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }

}
