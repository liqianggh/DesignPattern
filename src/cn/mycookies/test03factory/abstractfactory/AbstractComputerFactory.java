package cn.mycookies.test03factory.abstractfactory;

import cn.mycookies.test03factory.abstractfactory.computer.Computer;
import cn.mycookies.test03factory.abstractfactory.cpu.Cpu;
import cn.mycookies.test03factory.abstractfactory.gpu.Gpu;
import cn.mycookies.test03factory.abstractfactory.ram.Ram;

/**
 * 抽象电脑工厂
 *
 * @author Jann Lee
 * @date 2019-08-05 23:55
 **/
public abstract class AbstractComputerFactory {
    /**
     * 准备cpu
     * @return
     */
    public abstract Cpu prepareCpu();

    /**
     * 准备显卡
     * @return
     */
    public abstract Gpu prepareGpu();

    /**
     * 准备内存
     * @return
     */
    public abstract Ram prepareRam();

    public abstract Computer createComputer();

}
