package cn.mycookies.test15iterator.iteratorinjdk;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 晚餐菜单
 *
 * @author Jann Lee
 * @date 2019-08-20 22:39
 **/
public class DinnerMenu implements Iterable<String> {
    ArrayList<String> menuItems;

    public DinnerMenu() {
        this.menuItems = new ArrayList<>(5);
        menuItems.add("夫妻肺片 48元/份");
        menuItems.add("干煸豆角 26元/份");
        menuItems.add("毛血旺   68元/份");
        menuItems.add("大盘鸡   78元/份");
        menuItems.add("鱼香肉丝 38元/份");
    }


    @Override
    public Iterator<String> iterator() {
        return null;
    }
}
