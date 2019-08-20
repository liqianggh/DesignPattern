package cn.mycookies.test15iterator.iteratorinjdk;

import java.util.Iterator;
import java.util.List;

/**
 * @author Jann Lee
 * @date 2019-08-20 23:36
 **/
public class DinnerMenuIterator implements Iterator<String> {
    List<String> dataList;
    int position = 0;

    @Override
    public boolean hasNext() {

        return position != dataList.size() -1;
    }

    @Override
    public String next() {

        return dataList.get(++position);
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("被你删除光了");

        }
        dataList.remove(position);
    }
}
