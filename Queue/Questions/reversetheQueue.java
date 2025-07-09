package Queue.Questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reversetheQueue {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        Queue<Integer> pq = new LinkedList<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        //before
        System.out.println(pq);
        while(!pq.isEmpty())
        {
            st.push(pq.poll());
        }
        while(!st.isEmpty())
        {
            pq.add(st.pop());
        }
        System.out.println("after");
        System.out.println(pq);
    }
}
