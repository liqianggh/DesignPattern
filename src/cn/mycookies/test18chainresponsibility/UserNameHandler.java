package cn.mycookies.test18chainresponsibility;


/**
 * 校验用户名的handler
 *
 * @author Jann Lee
 * @date 2019-08-26 1:14
 **/
public class UserNameHandler extends Handler {
    @Override
    public void handle(ParameterBean parameterBean) {
        if (parameterBean == null || parameterBean.getUserName() == null) {
            System.out.println("用户名不能为空");
        } else {
            System.out.println("用户名校验通过");
            if (super.nextHandler != null) {
                super.nextHandler.handle(parameterBean);
            }
        }
    }
}
