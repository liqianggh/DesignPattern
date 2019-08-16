package cn.mycookies.test12adapter.classadapter;

/**
 * 适配器
 *
 * @author Jann Lee
 * @date 2019-08-16 21:36
 **/
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
