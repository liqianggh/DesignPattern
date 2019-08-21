package cn.mycookies.test17command;

/**
 * @author Jann Lee
 * @date 2019-08-22 0:38
 **/
public class OpenLightCommand implements Command {

    private Light light;

    public OpenLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.open();
    }
}
