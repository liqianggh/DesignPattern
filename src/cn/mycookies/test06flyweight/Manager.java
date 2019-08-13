package cn.mycookies.test06flyweight;

/**
 * 部门主管
 *
 * @author liqiang
 * @datetime 2019/8/13 19:30
 **/
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(department+"部门汇报:" + reportContent);
    }
    /**
     * 内部状态
     */
    private String title = "部门经理";
    /**
     * 外部状态
     */
    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public String getTitle() {
        return title;
    }

}
