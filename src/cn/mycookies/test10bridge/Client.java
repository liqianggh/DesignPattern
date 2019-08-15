package cn.mycookies.test10bridge;

/**
 * 通过桥模式可以进行多个维度任意组合
 *
 * @author Jann Lee
 * @date 2019-08-15 22:40
 **/
public class Client {

    public static void main(String[] args) {
        ICBCBank icbcBank = new ICBCBank(new SavingAccount());
        Account savingAccount = icbcBank.openAccount();
        savingAccount.showAccountType();

        ICBCBank icbcBank2 = new ICBCBank(new DepositAccount());
        Account depositAccount = icbcBank2.openAccount();
        depositAccount.showAccountType();;

        ABCBank abcBank = new ABCBank(new SavingAccount());
        Account account = abcBank.openAccount();
        account.showAccountType();
    }
}
