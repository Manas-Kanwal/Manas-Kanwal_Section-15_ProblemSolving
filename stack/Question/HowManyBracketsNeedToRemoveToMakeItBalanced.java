package stack.Question;
import java.util.*;

public class HowManyBracketsNeedToRemoveToMakeItBalanced {


    static int minRemovals(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop(); // matched
                } else {
                    st.push(ch); // unmatched closing
                }
            }
        }

        // Remaining elements are unmatched
        return st.size();
    }

    public static void main(String[] args) {
        String str = "())(()";
        System.out.println("Minimum removals: " + minRemovals(str)); // Output: 2
    }
}


