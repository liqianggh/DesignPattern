package cn.mycookies.test10bridge;

/**
 * 工商银行
 *
 * @author Jann Lee
 * @date 2019-08-15 22:37
 **/
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("打开了工商银行账号");
        return account.openAccount();
    }
}
