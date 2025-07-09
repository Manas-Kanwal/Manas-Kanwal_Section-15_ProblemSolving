package Queue.Questions;
import java.util.*;

class MyStack {
    Queue <Integer> pq = new LinkedList<>();
    
    int size =  0 ;
    public MyStack() {
        //nothing
    }
    
    public void push(int x) {
        pq.add(x);
        size++;
    }
    
    public int pop() {
        if(size==0)
        {
            return -1;
        }
        for(int i = 0 ; i<size-1 ; i++)
        {
            pq.add(pq.poll());
        }
        int val = pq.peek();
        pq.poll();
        size--;
        return val;
        
    }
    
    public int top() {
        if(size==0)
        {
            return -1;
        }
        for(int i = 0 ; i<size-1 ; i++)
        {
            pq.add(pq.poll());
        }
        int val = pq.peek();
        pq.add(pq.poll());
        return val;
    }
    
    public boolean empty() {
        if(size==0)
        {
            return true ;
        }
        else 
        {
            return false ;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
