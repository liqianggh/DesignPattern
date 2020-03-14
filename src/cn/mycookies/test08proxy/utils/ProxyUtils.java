package cn.mycookies.test08proxy.utils;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 将生成的代理类保存为.class文件的工具类
 *
 * @author Jann Lee
 * @date 2019-08-15 0:27
 */
public class ProxyUtils {
    /**
     * 将代理类保存到指定路径
     *
     * @param path           保存到的路径
     * @param proxyClassName 代理类的Class名称
     * @param interfaces     代理类接口
     * @return
     */
    public static boolean saveProxyClass(String path, String proxyClassName, Class[] interfaces) {
        if (proxyClassName == null || path == null) {
            return false;
        }
        // 获取文件字节码，然后输出到目标文件中
        byte[] classFile = ProxyGenerator.generateProxyClass(proxyClassName, interfaces);
        try (FileOutputStream out = new FileOutputStream(path)) {
            out.write(classFile);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}