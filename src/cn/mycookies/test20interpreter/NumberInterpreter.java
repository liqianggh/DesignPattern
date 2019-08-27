package cn.mycookies.test20interpreter;

/**
 * 数字解释器
 *
 * @author Jann Lee
 * @date 2019-08-27 23:44
 **/
public class NumberInterpreter implements Interpreter {

    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String number) {
        this.number = Integer.valueOf(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
