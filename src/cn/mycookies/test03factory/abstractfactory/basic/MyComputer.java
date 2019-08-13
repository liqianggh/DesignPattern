package cn.mycookies.test03factory.abstractfactory.basic;

/**
 * 电脑对象
 *
 * @author Jann Lee
 * @date 2019-08-05 22:41
 **/
public class MyComputer {

    /**
     * 因特尔处理器
     */
    private InterCpu interCpu;
    /**
     * 联想内存条
     */
    private LenovoRam lenovoRam;

    /**
     * 英伟达显卡
     */
    private NvidiaGpu nvidiaGpu;

    public MyComputer(InterCpu interCpu, LenovoRam lenovoRam, NvidiaGpu nvidiaGpu) {
        this.interCpu = interCpu;
        this.lenovoRam = lenovoRam;
        this.nvidiaGpu = nvidiaGpu;
    }

    @Override
    public String toString() {
        return "配置：\n  " + interCpu + "\n  " + nvidiaGpu+ "\n  " + lenovoRam;
    }
}
