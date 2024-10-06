package brackets;

import java.util.HashMap;
import java.util.Stack;

public class BalancedSymbols {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> matchingSymbols = new HashMap<>();
        matchingSymbols.put(')','(');
        matchingSymbols.put(']','[');
        matchingSymbols.put('}','{');

        for(char ch : expression.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }else if (ch == ')' || ch == '}' || ch == ']') {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(top != matchingSymbols.get(ch)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
