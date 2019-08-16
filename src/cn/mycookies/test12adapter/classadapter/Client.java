package cn.mycookies.test12adapter.classadapter;

/**
 * @author Jann Lee
 * @date 2019-08-16 21:37
 **/
public class Client {
    public static void main(String[] args) {
        Target adapter = new Adapter();
        adapter.request();
    }
}
