package Array;

public class LinkedListImplementationOfStack {
    static class node{
        int data ;
        node next;
        node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static class stack
    {
        node head = null;
        int size = 0 ;
        void push(int x)
        {
            // if(isFull())
            // {
            //     System.out.println("Stack is Full ;");
            //     return;
            // }
            node temp = new node(x);
            temp.next = head;
            head = temp ;
            size++;
        }
        int peek()
        {
            return head.data;
        }
        int pop()
        {
            if(isEmpty())
            {
                System.out.println("Stack is Empty ;");
                return -1;
            }
            int poped = head.data;
            head = head.next ;
            size--;
            return poped;
        }
        int size ()
            {
                return size;
            }
        void display()
        {
            node temp = head ;
            while(temp!=null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next ;
            }
            System.out.println();
        }

        boolean isEmpty()
            {
                if(head==null )
                {
                    return true ;
                }
                else{
                    return false ;
                }
            }
           

    }
     public static void main(String[] args) {
        stack st = new stack();
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
