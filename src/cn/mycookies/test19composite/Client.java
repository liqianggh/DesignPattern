package cn.mycookies.test19composite;

/**
 * 慕课网课程，分为目录 和课程
 *
 * @author Jann Lee
 * @date 2019-08-26 23:23
 **/
public class Client {
    public static void main(String[] args) {
        CatalogComponent basicJava = new Course("Java基础入门", 99.99);
        CatalogComponent seniorJava = new Course("Java并发编程实战", 39.9);
        CatalogComponent javaCatalog = new CourseCatalog("Java课程目录");
        javaCatalog.add(basicJava);
        javaCatalog.add(seniorJava);

        CatalogComponent linuxCatalog = new CourseCatalog("Linux课程目录");

        CatalogComponent mysqlCatalog = new CourseCatalog("MySQL课程目录");
        CatalogComponent basicMySQL = new Course("SQL编程", 39.8);
        CatalogComponent seniorMySQL = new Course("InnoDB存储引擎", 59.0);
        mysqlCatalog.add(basicMySQL);
        mysqlCatalog.add(seniorMySQL);

        CatalogComponent catalogComponent = new CourseCatalog("主目录");
        catalogComponent.add(javaCatalog);
        catalogComponent.add(linuxCatalog);
        catalogComponent.add(mysqlCatalog);

        catalogComponent.print();
    }
}
