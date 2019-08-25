package cn.mycookies.test18chainresponsibility;

/**
 * 责任链的抽象类
 *
 * @author Jann Lee
 * @date 2019-08-26 1:11
 **/
public abstract class Handler {
    protected Handler nextHandler;

    public abstract void handle(ParameterBean parameterBean);

    public void nextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }
}
