package cn.mycookies.test13observer;

/**
 * 观察者
 *
 * @author Jann Lee
 * @date 2019-08-20 0:17
 **/
public class ZhangSanObserver implements Observer{

    @Override
    public void update(String message) {
        System.out.println("张三收到了消息："+message);
    }

}
