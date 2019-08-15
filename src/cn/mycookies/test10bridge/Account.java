package cn.mycookies.test10bridge;

/**
 * 银行账号接口
 *
 * @author Jann Lee
 * @date 2019-08-15 22:30
 **/
public interface Account {

    /**
     * 开户
     */
    Account openAccount();

    /**
     * 查看账户类型
     */
    void showAccountType();
}
