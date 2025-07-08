package stack.Question;
import java.util.*;

public class infix {

    public static void main(String[] args) {
        String s = "9-5+3*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            } else if (op.isEmpty()) {
                op.push(ch);
            } else {
                if (ch == '+' || ch == '-') {
                    if (val.size() >= 2 && !op.isEmpty()) {
                        int val2 = val.pop();
                        int val1 = val.pop();

                        if (op.peek() == '-') val.push(val1 - val2);
                        else if (op.peek() == '+') val.push(val1 + val2);
                        else if (op.peek() == '*') val.push(val1 * val2);
                        else if (op.peek() == '/') val.push(val1 / val2);

                        op.pop();
                    }
                    op.push(ch);
                } else if (ch == '*' || ch == '/') {
                    if (val.size() >= 2 && !op.isEmpty()) {
                        int val2 = val.pop();
                        int val1 = val.pop();

                        if (op.peek() == '*') val.push(val1 * val2);
                        else if (op.peek() == '/') val.push(val1 / val2);

                        op.pop();
                    }
                    op.push(ch);
                }
            }
        }

        while (val.size() >= 2 && !op.isEmpty()) {
            int val2 = val.pop();
            int val1 = val.pop();

            if (op.peek() == '-') val.push(val1 - val2);
            else if (op.peek() == '+') val.push(val1 + val2);
            else if (op.peek() == '*') val.push(val1 * val2);
            else if (op.peek() == '/') val.push(val1 / val2);

            op.pop();
        }

        if (!val.isEmpty()) {
            System.out.println(val.peek());
        } else {
            System.out.println("Error: Stack is empty.");
        }
    }
}
