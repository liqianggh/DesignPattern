package cn.mycookies.test17command;

/**
 * @author Jann Lee
 * @date 2019-08-22 0:37
 **/
public class CloseLightCommand implements Command {
    private Light light;

    public CloseLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.close();
    }
}
