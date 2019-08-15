package cn.mycookies.test10bridge;

/**
 * 银行抽象类
 *
 * @author Jann Lee
 * @date 2019-08-15 22:35
 **/
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    public abstract Account openAccount();

}
