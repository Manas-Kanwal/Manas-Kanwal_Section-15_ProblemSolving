package stack.Question;
import java.util.*;

public class Infix {
    

    public static void main(String[] args) {
        String s = "9-5+3*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int asci = (int)ch;

            if (asci >= 48 && asci <= 57) {
                val.push(asci-48);
            } else if (op.size() == 0) {
                op.push(ch);
            } else {
                if (ch == '+' || ch == '-') {
                    //work
                    int val2 = val.pop();
                    int val1 = val.pop();

                    if (op.peek() == '-') val.push(val1-val2);
                    if (op.peek() == '+') val.push(val1+val2);
                    if (op.peek() == '*') val.push(val1*val2);
                    if (op.peek() == '/') val.push(val1/val2);

                    op.pop();
                    op.push(ch);
                }
                else if (ch == '*' || ch == '/') {
                    int val2 = val.pop();
                    int val1 = val.pop();

                    if (op.peek() == '*') val.push(val1*val2);
                    if (op.peek() == '/') val.push(val1/val2);

                    op.pop();
                    op.push(ch);
                } else {
                    op.push(ch);
                }
            }
        }

        while (val.size() > 1 && !op.isEmpty()) {
            int val2 = val.pop();
            int val1 = val.pop();

            if (op.peek() == '-') val.push(val1 - val2);
            if (op.peek() == '+') val.push(val1 + val2);
            if (op.peek() == '*') val.push(val1 * val2);
            if (op.peek() == '/') val.push(val1 / val2);

            op.pop();
        }

        System.out.println(val.peek());
    }
}
