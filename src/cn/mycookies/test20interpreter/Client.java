package cn.mycookies.test20interpreter;

/**
 * @author Jann Lee
 * @date 2019-08-28 0:02
 **/
public class Client {

    public static void main(String[] args) {
        String expression = "1 3 +";
        ExpressionParser expressionParser = new ExpressionParser();
        System.out.println(expressionParser.parse(expression));
    }
}
