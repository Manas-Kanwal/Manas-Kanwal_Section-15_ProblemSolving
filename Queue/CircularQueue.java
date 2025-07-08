package Queue;

public class CircularQueue {
    static class Queue{
        int front = -1;
        int rear = -1 ;
        int size = 0 ;
        int arr[] = new int [8];
        public void add(int val)
        {
            if(size == arr.length)
            {
                System.out.println("Queue is full");
                return ;
            }
            else if (size == 0)
            {
                front = rear = 0 ;
                arr[0] = val;
                size++;
            }
            else if (rear < arr.length-1)
            {
                arr[++rear] = val ;
                size ++;
            }
            else if (rear == arr.length-1)
            {
                rear = 0 ;
                arr[0] = val ;
                size ++;
            }

        }
        int remove()
        {
            if(size == 0 )
            {
                System.out.println("Queue is  Empty");
                return -1;
            }
            else
            {
                int val = arr[front];
                if(front ==arr.length-1)front = 0 ;
                else front ++;
                size--;
                return val;
            }
        }
        public int peek ()
        {
            if(size == 0 )
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
        boolean isEmpty()
        {
            if(size == 0 )
            {
                return true ;
            }
            else{
                return false;
            }
        }
        public void display()
        {
            if(size ==0 )
            {
                System.out.println("Queue is Empty");
            }
            else{
                if(front < rear)
                {
                        for(int i = front ; i<= rear ; i++)
                        {
                            System.out.print(arr[i]+" ");
                        }
                }
                else{
                    for(int i = front ; i <arr.length ; i++)
                    {
                        System.out.print(arr[i] + " ");
                    }
                    for(int i = 0 ; i <= rear ; i++ )
                    {
                        System.out.print(arr[i] + " ");
                    }
                    
                }
                System.out.println( " ");


            }
        }
    }
    public static void main(String[] args) 
    {
        Queue pq = new Queue();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        pq.display();//12345
        pq.remove();
        pq.display();//2345
        System.out.println(pq.peek());//2
        System.out.println(pq.isEmpty());//false

    }
    
}
