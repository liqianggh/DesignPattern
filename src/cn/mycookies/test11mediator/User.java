package cn.mycookies.test11mediator;

/**
 * 用户
 *
 * @author Jann Lee
 * @date 2019-08-16 0:25
 **/
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void sendMessage(String message, User toUser){
        ChatMediator.sendMessage(message,this, toUser);
    }

}
