package cn.mycookies.test03factory.abstractfactory;

import cn.mycookies.test03factory.abstractfactory.computer.Computer;
import cn.mycookies.test03factory.abstractfactory.computer.HighPerformanceComputer;
import cn.mycookies.test03factory.abstractfactory.computer.PoorPerformanceComputer;
import cn.mycookies.test03factory.abstractfactory.cpu.CoreI5Cpu;
import cn.mycookies.test03factory.abstractfactory.cpu.CoreI9Cpu;
import cn.mycookies.test03factory.abstractfactory.cpu.Cpu;
import cn.mycookies.test03factory.abstractfactory.gpu.Gpu;
import cn.mycookies.test03factory.abstractfactory.gpu.Nvida1080TiGpu;
import cn.mycookies.test03factory.abstractfactory.gpu.Nvida760Gpu;
import cn.mycookies.test03factory.abstractfactory.ram.Kinston16GRam;
import cn.mycookies.test03factory.abstractfactory.ram.Kinston8GRam;
import cn.mycookies.test03factory.abstractfactory.ram.Ram;

/**
 * 低性能电脑工厂
 *
 * @author Jann Lee
 * @date 2019-08-06 0:05
 **/
public class PoorPerformanceComputerFactory extends AbstractComputerFactory {
    @Override
    public Cpu prepareCpu() {
        return new CoreI5Cpu();
    }

    @Override
    public Gpu prepareGpu() {
        return new Nvida760Gpu();
    }

    @Override
    public Ram prepareRam() {
        return new Kinston8GRam();
    }

    @Override
    public Computer createComputer() {
        return new PoorPerformanceComputer(prepareCpu(), prepareGpu(), prepareRam());
    }
}
