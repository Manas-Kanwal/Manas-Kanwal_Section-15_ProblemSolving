package stack;
import java.util.Stack;

public class stackrecursive {
    static void recursiveDisplay(Stack<Integer> st )
        {
            if(st.size()<=0)
            {
                return;
            }
            int top = st.pop();
            System.out.print(top);

            recursiveDisplay(st);
            
        } 
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        //push
        st.push(01);
        st.push(23);
        st.push(5);
        st.push(7);
        System.out.println(st);
        System.out.println("after : ");
        recursiveDisplay(st);
    }
}



//STACK UNDERFLOW
/*
 * IF WE POP MORE ELEMENTS PRESENT IN THE STACK 
 *IF THERE ARE NO ELEMENTS IN THE STACK AND WE ARE POPING 
 
 */



//OVERFLOW
/*
 * IF THEIR IS A FIXED SIZE OF THE STACK AND WE ARE TRYING TO PUSH MORE ELEMENTS  
 * IN IT THEN ITS SIZE , THERE IS A STACK OVERFLOW ERROR . 
 * 
 */