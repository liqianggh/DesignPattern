package cn.mycookies.test22visitor;

/**
 * @author Jann Lee
 * @date 2019-08-28 0:24
 **/
public class FreeCourse extends Course{
    private int price;

    public int getPrice(){
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
