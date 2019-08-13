package cn.mycookies.test03factory.abstractfactory.computer;

import cn.mycookies.test03factory.abstractfactory.cpu.Cpu;
import cn.mycookies.test03factory.abstractfactory.gpu.Gpu;
import cn.mycookies.test03factory.abstractfactory.ram.Ram;

/**
 * 抽象电脑类
 *
 * @author Jann Lee
 * @date 2019-08-05 23:21
 **/
public abstract class Computer {
    private Cpu cpu;
    private Gpu gpu;
    private Ram ram;

    public Computer(Cpu cpu, Gpu gpu, Ram ram) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "配置：\n  " + cpu + "\n  " + gpu+ "\n  " + ram;
    }
}
