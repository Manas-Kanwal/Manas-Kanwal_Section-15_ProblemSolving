package Queue;

public class ArrayImplementation {
    static class Queue{
        private int arr[] = new int [100];

        int front = -1;
        int rear = -1; 
        int size = 0 ;
        public void add(int val )
        {
            if(rear == arr.length)
            {
                System.out.println("Queue is full ");
                return;
            }
            if(front == -1)
            {
                front = rear = 0 ;
                arr[0] = val;
                size++;
            }
            else{
                arr[++rear]= val ;
                size++;

            }
        }
        public int poll()
        {
            if(size==0)
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            int x = arr[front];
            front++;
            size-- ;
            return x;
            
        }
        public int peek()
        {
            if(size==0)
            {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
        }
        public Boolean isEmpty()
        {
            if(size<= 0 )
            {
                return true;
            }
            else{
                return false;
            }
        }
        public int size ()
        {
            return size;
        }
        public void Display()
        {
            if(size == 0 )
            {
                System.out.println("Queueis Empty");
            }else{
            for(int i = front ; i<= rear  ; i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        }

    }
    public static void main(String[] args) {
        Queue pq = new Queue();
        pq.add(12);
        pq.add(11);
        pq.Display();
        pq.poll();
        pq.Display();
        System.out.println(pq.size());
        System.out.println(pq.isEmpty());
        System.out.println(pq.peek());
    }
}
