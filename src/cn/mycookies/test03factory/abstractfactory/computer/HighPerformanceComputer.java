package cn.mycookies.test03factory.abstractfactory.computer;

import cn.mycookies.test03factory.abstractfactory.cpu.Cpu;
import cn.mycookies.test03factory.abstractfactory.gpu.Gpu;
import cn.mycookies.test03factory.abstractfactory.ram.Ram;

/**
 * 高性能电脑
 *
 * @author Jann Lee
 * @date 2019-08-05 23:46
 **/
public class HighPerformanceComputer extends Computer {

    public HighPerformanceComputer(Cpu cpu, Gpu gpu, Ram ram) {
        super(cpu, gpu, ram);
    }
}
