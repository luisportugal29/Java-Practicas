package Stack;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String [] args) {

        String expression = "({[]})";
        System.out.println(isBalancedExpression(expression) ? "Perfectamente Balanceado" : "No Esta Balanceado");

    }

    public static boolean isBalancedExpression(String expression) {
        Map<Character, Character > elements = new HashMap<>();
        elements.put('}','{');
        elements.put(')','(');
        elements.put(']','[');

        Stack<Character> stack = new Stack<Character>();

        for (char element : expression.toCharArray()) {
            if (!elements.containsKey(element)) {
                stack.push(element);
                continue;
            }

            Character currentCharacter = elements.get(element);
            Character lastElement = stack.pop();
            if ( currentCharacter.compareTo(lastElement) != 0 )
                return false;

        }
        return true;
    }
}
