package cn.mycookies.test13observer.observerinjdk;

import java.util.Observable;

/**
 * 天气预报员
 *
 * @author Jann Lee
 * @date 2019-08-20 0:49
 **/
public class Weatherman extends Observable {

    @Override
    public void notifyObservers() {
        if (!hasChanged()) {
            System.out.println("天气没有发生变化，不会进行预报");
        }
        super.notifyObservers("今天天气很好， 适合约会");
    }

    /**
     * 改变对象状态
     */
    public void changed(){
        super.setChanged();
        System.out.println("天气发生了变化");
    }
}
