package cn.mycookies.test10bridge;

/**
 * 活期账户
 *
 * @author Jann Lee
 * @date 2019-08-15 22:31
 **/
public class SavingAccount implements Account{


    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("活期账号");
    }
}
