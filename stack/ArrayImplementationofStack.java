package stack;

public class ArrayImplementationofStack {
    public static class Stack{
        private int arr[] = new int [5];
        private int idx = 0;
        
        void push(int x)
        {
            if(isFull())
            {
                System.out.println("Stack is Full ;");
                return;
            }
            arr[idx++] = x;
        }

        int peek()
        {
            if(idx == 0 )
            {
                System.out.println("stack is empty ");
                return -1 ;
            
            }
            else
            {
            return arr[idx-1];
            }
        }

        int pop()
        {
            if(idx == 0)
            {
                System.out.println("stack is empty ");
                return -1;
            }
            else
            {
                int top = arr[idx-1];
                arr[idx-1]=0;
                idx--;
                return top;
            }
        }
    
    void display()
    {
        for(int i = idx-1 ; i >=0 ; i--)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    int size ()
    {
        return idx;
    }
    boolean isEmpty()
    {
        if(idx==0)
        {
            return true ;
        }
        else{
            return false;
        }
    }

    boolean isFull()
    {
        if(idx==arr.length)
        {
            return true ;
        }
        else
        {
            return false;
        }
    }
}
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();//1234
        System.out.println(st.size());//4
        System.out.println(st.pop());//4
        System.out.println(st.peek());//3
        st.display(); //123
    }
}
