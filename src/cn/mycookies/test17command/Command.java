package cn.mycookies.test17command;

/**
 * 命令接口，所有命令都要实现该接口
 *
 * @author Jann Lee
 * @date 2019-08-22 0:27
 **/
public interface Command {

    /**
     * 执行命令
     */
    void execute();
}
