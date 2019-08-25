package cn.mycookies.test18chainresponsibility;

/**
 * @author Jann Lee
 * @date 2019-08-26 1:20
 **/
public class Client {

    public static void main(String[] args) {
        UserNameHandler userNameHandler = new UserNameHandler();
        PasswordHandler passwordHandler = new PasswordHandler();

        ParameterBean parameterBean = new ParameterBean("用户名", "密码");
        parameterBean.setUserName(null);

        userNameHandler.nextHandler(passwordHandler);
        userNameHandler.handle(parameterBean);
    }
}
