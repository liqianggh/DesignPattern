package cn.mycookies.test17command;

/**
 * 开灯 先开再关灯
 *
 * @author Jann Lee
 * @date 2019-08-22 0:53
 **/
public class Client {

    public static void main(String[] args) {
        Light light = new Light();
        CloseLightCommand closeLightCommand = new CloseLightCommand(light);
        OpenLightCommand openLightCommand = new OpenLightCommand(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.addCommand(closeLightCommand);
        remoteControl.addCommand(openLightCommand);

        remoteControl.executeCommand();

    }
}
