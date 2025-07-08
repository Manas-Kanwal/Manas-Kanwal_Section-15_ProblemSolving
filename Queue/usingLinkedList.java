package Queue;

public class usingLinkedList {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        node head = null ;
        node tail = null;
        int size = 0 ;

        public void add(int x )
        {
            node temp = new node(x);
            if(size ==0 )
            {
                head = tail = temp ;
                size++;
            }
            else{
                tail.next = temp ;
                tail = tail.next;
                size++;
            }

        }
        public int remove ()
        {
            if(size == 0)
            {
                System.out.println("Queue is Empty ");
                return -1;
            }
            else{
                int x = head.data ;
                head = head.next ;
                size--;
                return x ;
            }
        }
        public int peek()
        {
            if(size == 0)
            {
                System.out.println("Queue is Empty ");
                return -1;
            }
            else{
                return head.data;
            }

        }
        public boolean isEmpty(){
            if(size==0)
            {
                return true;
            }
            else
            {
                return false ;
            }
        }
        public int size ()
        {
            return size ;
        }
        public void display()
        {
            node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Queue pq = new Queue();
        pq.add(12);
        pq.add(11);
        pq.add(10);
        pq.add(9);
        pq.display();
        pq.remove();
        pq.display();
        System.out.println(pq.peek());
        System.out.println(pq.isEmpty());
        System.out.println(pq.size());
    }
}
