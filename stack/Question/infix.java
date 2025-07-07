package stack.Question;
import java.util.*;

public class infix {
    static int infixsol(String s) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int asci = (int) ch;

            if (asci >= 48 && asci <= 57) {
                val.push(asci - 48);
            } else if (op.size() == 0) {
                op.push(ch);
            } else {
                if (ch == '+' || ch == '-') {
                    while (!op.isEmpty()) {
                        int val2 = val.pop();
                        int val1 = val.pop();
                        char top = op.pop();

                        if (top == '-') val.push(val1 - val2);
                        else if (top == '+') val.push(val1 + val2);
                        else if (top == '*') val.push(val1 * val2);
                        else if (top == '/') val.push(val1 / val2);
                    }
                    op.push(ch);
                } else if (ch == '*' || ch == '/') {
                    while (!op.isEmpty() && (op.peek() == '*' || op.peek() == '/')) {
                        int val2 = val.pop();
                        int val1 = val.pop();
                        char top = op.pop();

                        if (top == '*') val.push(val1 * val2);
                        else if (top == '/') val.push(val1 / val2);
                    }
                    op.push(ch);
                }
            }
        }

        while (val.size() > 1 && !op.isEmpty()) {
            int val2 = val.pop();
            int val1 = val.pop();
            char top = op.pop();

            if (top == '+') val.push(val1 + val2);
            else if (top == '-') val.push(val1 - val2);
            else if (top == '*') val.push(val1 * val2);
            else if (top == '/') val.push(val1 / val2);
        }

        return val.peek();
    }

    public static void main(String[] args) {
        String s = "9-5+3*4/6";
        System.out.println(infixsol(s));  // Expected output: 6
    }
}

