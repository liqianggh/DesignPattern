package cn.mycookies.test15iterator;

/**
 * 迭代器接口, 为了跟jdk区分所以叫MyIterator
 *
 * @author Jann Lee
 * @date 2019-08-20 22:44
 **/
public interface MyIterator<T> {
    /**
     * 是否还有下一个元素
     */
    boolean hasNext();

    /**
     * 下一个元素
     */
    T next();

    /**
     * 删除并返回元素
     */
    T remove();

}
