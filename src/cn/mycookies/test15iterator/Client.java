package cn.mycookies.test15iterator;

/**
 * @author Jann Lee
 * @date 2019-08-20 23:09
 **/
public class Client {

    public static void main(String [] args){
        DinnerMenu dinnerMenu = new DinnerMenu();
        MyIterator iterator = dinnerMenu.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
