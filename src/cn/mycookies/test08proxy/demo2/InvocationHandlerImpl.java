package cn.mycookies.test08proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 基于JDK技术 动态代理类技术核心 Proxy类和一个 InvocationHandler 接口
 *
 * @author Jann Lee
 * @date 2019-11-23 16:40
 **/
public class InvocationHandlerImpl implements InvocationHandler {

    /**
     * 委托对象，既被代理的对象
     */
    private Object target;

    public InvocationHandlerImpl(Object target) {
        this.target = target;
    }

    /**
     * 生成代理对象
     * 1. Classloader loader: 制定当前被代理对象使用的累加子啊其，获取加载器的方法固定
     * 2. Class<?>[] interfaces: 委托类的接口类型，使用泛型方法确认类型
     * 3. InvocationHandler handler： 事件处理，执行委托对象的方法时会触发事件处理器方法，
     * 会把当前执行的委托对象方法作为参数传入
     */
    public Object getProxyInstance() {
        Class clazz = target.getClass();

        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();

        method.invoke(target, args);

        System.out.println("保存订单用时: " + (System.currentTimeMillis() - start) + "ms");

        return null;
    }

}
