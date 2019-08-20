package cn.mycookies.test15iterator;

import java.util.List;

/**
 *
 * 晚餐迭代器
 *
 * @author Jann Lee
 * @date 2019-08-20 23:01
 **/
public class DinnerMenuIterator implements MyIterator<String>{
    List<String> dataList;
    int position = 0;

    public DinnerMenuIterator(List<String> dataList) {
        this.dataList = dataList;
    }

    @Override
    public boolean hasNext() {

        return position != dataList.size() -1;
    }

    @Override
    public String next() {

        return dataList.get(++position);
    }

    @Override
    public String remove() {
        if (position <= 0) {
            throw new IllegalStateException("被你删除光了");

        }
        dataList.remove(position);
        return dataList.remove(position);
    }
}
