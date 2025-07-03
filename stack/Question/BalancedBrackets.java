package stack.Question;

import java.util.Stack;
//step one : if a opening braket then push. 

public class BalancedBrackets {
    static boolean bal(String str)
    {
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i<str.length() ; i++)
        {
            if(str.charAt(i)=='(')//if opening braces push 
            {
                st.push(str.charAt(i));
            }
            else if(str.charAt(i)==')')//if closing check the condition and then pop 
            {
                if (!st.isEmpty() && st.peek() == '(') //condition to pop
                {
                    st.pop();
                } 
                else
                {
                    return false; // unmatched closing bracket or empty stack
                }
            }
        }
        if(!st.isEmpty())
        {
            return false ;
        }
        else
        {
            return true ;
        }

    }
    public static void main(String[] args) {
        
        String str = "()(())";
        System.out.println(bal(str));
    }
    


}
