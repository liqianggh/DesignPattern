package cn.mycookies.test10bridge;

/**
 * 农业银行
 *
 * @author Jann Lee
 * @date 2019-08-15 22:39
 **/
public class ABCBank extends Bank{

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("开通了农业银行账号");
        return account.openAccount();
    }
}
