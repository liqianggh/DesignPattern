package cn.mycookies.test18chainresponsibility;

/**
 * 参数bean
 *
 * @author Jann Lee
 * @date 2019-08-26 1:13
 **/
public class ParameterBean {

    private String userName;

    private String password;

    public ParameterBean(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ParameterBean{" + "userName='" + userName + '\'' + ", password='" + password + '\'' + '}';
    }
}
