package cn.mycookies.test20interpreter;

/**
 * 操作工具类
 *
 * @author Jann Lee
 * @date 2019-08-27 23:48
 **/
public class OperatorUtil {
    private static final String ADD = "+";
    private static final String MULTI = "*";

    /**
     * 是否是操作符
     */
    public static boolean isOperator(String symbol) {
        return ADD.equals(symbol) || MULTI.equals(symbol);
    }

    public static Interpreter getExpressionObject(Interpreter firstInterpreter, Interpreter secondInterpreter, String symbol) {
        if (ADD.equals(symbol)) {
            return new AddInterpreter(firstInterpreter, secondInterpreter);
        } else if (MULTI.equals(symbol)) {
            return new MultiInterpreter(firstInterpreter, secondInterpreter);
        }
        return null;
    }

}
