import java.util.Stack;

public class ONP {
    public static String toONP(String equation) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : equation.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
            } else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    sb.append(stack.pop());
                }
                stack.push(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop();
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static double evaluateONP(String equation) {
        Stack<Double> stack = new Stack<>();
        for (char c : equation.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push((double) (c - '0'));
            } else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
                double b = stack.pop();
                double a = stack.pop();
                double result = getResult(c, a, b);
                stack.push(result);
            }
        }
        return stack.pop();
    }

    private static double getResult(char c, double a, double b) {
        double result;
        if (c == '+') {
            result = a + b;
        } else if (c == '-') {
            result = a - b;
        } else if (c == '*') {
            result = a * b;
        } else if (c == '/') {
            result = a / b;
        } else {
            if (b == 0)
                result = 1;
            else {
                result = 1;
                for (int i = 0; i < b; i++) {
                    result *= a;
                }
            }
        }
        return result;
    }

    private static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        } else if (operator == '^') {
            return 3;
        } else {
            return 0;
        }
    }
}