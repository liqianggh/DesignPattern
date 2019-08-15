package cn.mycookies.test10bridge;

/**
 * 定期存款账户
 *
 * @author Jann Lee
 * @date 2019-08-15 22:31
 **/
public class DepositAccount implements Account{


    @Override
    public Account openAccount() {
        System.out.println("打开了定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("定期账户");
    }
}
