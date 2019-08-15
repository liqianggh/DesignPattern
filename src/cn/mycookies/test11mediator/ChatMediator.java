package cn.mycookies.test11mediator;

import java.util.Date;

/**
 *
 * 聊天中介者
 *
 * @author Jann Lee
 * @date 2019-08-16 0:27
 **/
public class ChatMediator {

    /**
     * 为了简化代码，此处直接打印出消息，
     * 实际实现过程中可能会借助监听者模式实现消息通知
     */
    public static void sendMessage(String message, User from, User to) {
        System.out.println(new Date().toString()+": "+from.getName()+" @" +to.getName()+"  "+message);    }
}
