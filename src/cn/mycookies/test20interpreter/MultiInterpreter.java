package cn.mycookies.test20interpreter;

/**
 * 乘法解释器
 *
 * @author Jann Lee
 * @date 2019-08-27 23:42
 **/
public class MultiInterpreter implements Interpreter{
    private Interpreter fistExpression, secondExpression;

    public MultiInterpreter(Interpreter fistExpression, Interpreter secondExpression) {
        this.fistExpression = fistExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.fistExpression.interpret() * this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }
}
