package cn.mycookies.test13observer;

import java.util.HashSet;
import java.util.Set;

/**
 * 具体的主题，如天气预报，微信朋友圈等
 *
 * @author Jann Lee
 * @date 2019-08-20 0:08
 **/
public class ConcreteSubject implements Subject{

    /**
     * 用来存储已注册监听者信息
     */
    private Set<Observer> observerSet;

    public ConcreteSubject() {
        observerSet = new HashSet<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        boolean registerResult = observerSet.add(observer);
        if (registerResult) {
            System.out.println("观察者注册成功, 当前观察者数量:"+observerSet.size());
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        boolean registerResult = observerSet.remove(observer);
        if (registerResult) {
            System.out.println("观察者已经移除, 当前观察者数量:"+observerSet.size());
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observerSet){
            observer.update("今天会下雨，出门请带伞");
        }
    }
}
