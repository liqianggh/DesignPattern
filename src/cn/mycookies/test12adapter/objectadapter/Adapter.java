package cn.mycookies.test12adapter.objectadapter;

/**
 *
 * 对象适配器
 *
 * @author Jann Lee
 * @date 2019-08-16 21:43
 **/
public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
