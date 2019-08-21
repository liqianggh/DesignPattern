package cn.mycookies.test17command;

import java.util.ArrayList;
import java.util.List;

/**
 * 遥控器【命令的执行者】
 *
 * @author Jann Lee
 * @date 2019-08-22 0:41
 **/
public class RemoteControl {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command){

        commandList.add(command);
    }

    public void executeCommand(){
        for(Command command : commandList){
            command.execute();
        }
        commandList.clear();
    }
}
