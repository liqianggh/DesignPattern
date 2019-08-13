package cn.mycookies.test03factory.abstractfactory;

import cn.mycookies.test03factory.abstractfactory.computer.Computer;
import cn.mycookies.test03factory.abstractfactory.computer.HighPerformanceComputer;
import cn.mycookies.test03factory.abstractfactory.cpu.CoreI9Cpu;
import cn.mycookies.test03factory.abstractfactory.cpu.Cpu;
import cn.mycookies.test03factory.abstractfactory.gpu.Gpu;
import cn.mycookies.test03factory.abstractfactory.gpu.Nvida1080TiGpu;
import cn.mycookies.test03factory.abstractfactory.ram.Kinston16GRam;
import cn.mycookies.test03factory.abstractfactory.ram.Ram;

/**
 * 高性能电脑工厂
 *
 * @author Jann Lee
 * @date 2019-08-06 0:05
 **/
public class HighPerformanceComputerFactory extends AbstractComputerFactory {
    @Override
    public Cpu prepareCpu() {
        return new CoreI9Cpu();
    }

    @Override
    public Gpu prepareGpu() {
        return new Nvida1080TiGpu();
    }

    @Override
    public Ram prepareRam() {
        return new Kinston16GRam();
    }

    @Override
    public Computer createComputer() {
        return new HighPerformanceComputer(prepareCpu(), prepareGpu(), prepareRam());
    }
}
