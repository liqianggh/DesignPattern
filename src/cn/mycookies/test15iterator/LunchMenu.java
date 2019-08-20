package cn.mycookies.test15iterator;

import java.util.ArrayList;

/**
 * 午餐菜单那
 *
 * @author Jann Lee
 * @date 2019-08-20 22:57
 **/
public class LunchMenu implements Menu {
    ArrayList<String> menuItems;


    public LunchMenu() {
        this.menuItems = new ArrayList<>(5);
        menuItems.add("黄焖鸡鸡饭 12元/份");
        menuItems.add("章鱼小丸子 5元/份");
        menuItems.add("西安肉夹馍 5元/份");
        menuItems.add("烤冷面     5元/份");
        menuItems.add("手抓饼     6元/份");
    }

    @Override
    public MyIterator createIterator() {
        return new LunchMenuIterator(menuItems);
    }
}
