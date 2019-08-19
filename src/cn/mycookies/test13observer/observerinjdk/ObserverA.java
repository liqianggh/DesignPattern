package cn.mycookies.test13observer.observerinjdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 *
 * @author Jann Lee
 * @date 2019-08-20 0:45
 **/
public class ObserverA implements Observer {
    /**
     * 当被观察者改变将会调用这个方法
     *
     * @param   subject     the observable object.
     * @param   message   an argument passed to the <code>notifyObservers</code>method.
     *
     */
    @Override
    public void update(Observable subject, Object message) {
        System.out.println("ObserverA 收到了 "+subject.toString()+"的通知：" + message);
    }
}
