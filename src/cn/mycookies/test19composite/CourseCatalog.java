package cn.mycookies.test19composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程目录
 *
 * @author Jann Lee
 * @date 2019-08-26 23:10
 **/
public class CourseCatalog extends CatalogComponent{
    private List<CatalogComponent> items = new ArrayList<>();
    private String name;

    public CourseCatalog(String name) {
        this.name = name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void delete(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for( CatalogComponent temp: items){
            System.out.print("  ");
            temp.print();
        }
    }
}
