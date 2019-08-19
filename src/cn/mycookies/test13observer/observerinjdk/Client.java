package cn.mycookies.test13observer.observerinjdk;

import java.util.Observer;

/**
 * @author Jann Lee
 * @date 2019-08-20 0:52
 **/
public class Client {

    public static void main(String[] args) {
        Weatherman weatherman= new Weatherman();

        Observer observerA = new ObserverA();
        Observer observerB = new ObserverB();
        // 注册观察者
        weatherman.addObserver(observerA);
        weatherman.addObserver(observerB);
        // 变化
        weatherman.changed();
        weatherman.notifyObservers();

    }
}
