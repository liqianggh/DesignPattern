package cn.mycookies.test11mediator;

/**
 * @author Jann Lee
 * @date 2019-08-16 0:31
 **/
public class Client {

    public static void main(String[] args) {
        User lisi = new User("李四");
        User zhangSan = new User("张三");
        User wangEr = new User("王二");

        lisi.sendMessage("下班去喝酒啊", zhangSan);
        zhangSan.sendMessage("好啊好啊，还叫王二么？", lisi);
        lisi.sendMessage("当然~", zhangSan);
        zhangSan.sendMessage("ojbk", lisi);
        zhangSan.sendMessage("下班后老地方见", wangEr);
        wangEr.sendMessage("收到", zhangSan);


    }
}
