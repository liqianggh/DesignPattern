package cn.mycookies.test13observer.observerinjdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者b
 *
 * @author Jann Lee
 * @date 2019-08-20 0:48
 **/
public class ObserverB implements Observer {

    @Override
    public void update(Observable subject, Object message) {
        System.out.println("ObserverB 收到了 "+subject.toString()+"的通知：" + message);
    }
}
