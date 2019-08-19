package cn.mycookies.test13observer;

/**
 * @author Jann Lee
 * @date 2019-08-20 0:21
 **/
public class Client {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        Observer zhagnSan = new ZhangSanObserver();
        Observer lisi = new LiSiObserver();
        // 注册观察者
        subject.registerObserver(zhagnSan);
        subject.registerObserver(lisi);
        // 通知所有
        subject.notifyObserver();

        subject.removeObserver(lisi);
        subject.notifyObserver();

    }

}
