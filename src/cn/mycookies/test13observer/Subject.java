package cn.mycookies.test13observer;

/**
 * 主题接口
 *
 * @author Jann Lee
 * @date 2019-08-20 0:01
 **/
public interface Subject {
    /**
     * 注册观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver();

}
