package cn.mycookies.test12adapter.objectadapter;


/**
 * @author Jann Lee
 * @date 2019-08-16 21:37
 **/
public class Client {
    public static void main(String[] args) {
        Target adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}
