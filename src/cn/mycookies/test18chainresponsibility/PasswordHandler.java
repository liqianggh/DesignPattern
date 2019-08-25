package cn.mycookies.test18chainresponsibility;

/**
 * 密码检验器
 *
 * @author Jann Lee
 * @date 2019-08-26 1:18
 **/
public class PasswordHandler extends Handler {
    @Override
    public void handle(ParameterBean parameterBean) {
        if (parameterBean == null || parameterBean.getPassword() == null) {
            System.out.println("密码不能为空");
        } else {
            System.out.println("密码校验通过");
            if (super.nextHandler != null) {
                super.nextHandler.handle(parameterBean);
            }
        }
    }
}
