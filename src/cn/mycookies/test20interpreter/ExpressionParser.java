package cn.mycookies.test20interpreter;

import java.util.Stack;
import static cn.mycookies.test20interpreter.OperatorUtil.*;
/**
 * 解析器
 *
 * @author Jann Lee
 * @date 2019-08-27 23:48
 **/
public class ExpressionParser {
    private Stack<Interpreter> stack = new Stack<>();

    public int parse(String str) {
        String[] strItems = str.split(" ");
        for(String symbol: strItems){
            if (!isOperator(symbol)) {
                stack.push(new NumberInterpreter(symbol));
            } else {
                Interpreter first = stack.pop();
                Interpreter second = stack.pop();
                System.out.println(String.format("出栈：%d 和 %d", first.interpret(), second.interpret()));
                Interpreter operator = getExpressionObject(first, second, symbol);
                int tempResult = operator.interpret();
                System.out.println(String.format("阶段结果入栈：%d",tempResult));
                stack.push(new NumberInterpreter(tempResult));
            }
        }
        return stack.pop().interpret();
    }
}
