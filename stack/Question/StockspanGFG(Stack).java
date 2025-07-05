package stack.Question;
import java.util.*;
public class StockspanGFG {
        static ArrayList<Integer> calculateSpan(int[] arr) {
        Stack <Integer> st = new Stack <>();
        ArrayList<Integer> li = new ArrayList<>();
        
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            while(!st.isEmpty() && arr[i] >= arr[st.peek()])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                li.add(i+1);
            }
            else
            {
                li.add(i-st.peek());
            }
            
            st.push(i);
        }
        
        return li;
    
}
public static void main(String[] args) {
    
}
}
/*
 * Input: arr[] = [100, 80, 60, 70, 60, 75, 85]
Output: [1, 1, 1, 2, 1, 4, 6]
Explanation: Traversing the given input span 100 is greater than equal to 100 and there are no more elements behind 
it so the span is 1, 80 is greater than equal to 80 and smaller than 100 so the span is 1, 60 is greater than equal to 60 
and smaller than 80 so the span is 1, 70 is greater than equal to 60,70 and smaller than 80 so the span is 2 and so on.
 Hence the output will be 1 1 1 2 1 4 6.
 */