package cn.mycookies.test13observer;

/**
 * 抽象观察者
 *
 * @author Jann Lee
 * @date 2019-08-20 0:07
 **/
public interface Observer {

    /**
     * 被观察者通知时调用的方法
     *
     * @param message 更新的消息
     */
    void update(String message);


}
