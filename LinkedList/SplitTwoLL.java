public class SplitTwoLL {
    public  static class Node 
    {
        int data ;
        Node next;
        Node(int data)
        {
            this.data  = data ;
        }

    }
     static void print(Node head)
     {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
     }

     static void split(Node head )
     {
        Node list1 = new Node (0);
        Node list2 = new Node (1);
        Node tail = list1 ;//even 
        Node tail2 = list2;//odd
        Node temp = head ;
        while (temp !=null)
        {
        if(temp.data%2==0)
        {
            tail.next = temp ;
            tail= tail.next;
            temp = temp.next;

        }
        else
        {
            tail2.next = temp ;
            tail2= tail2.next;
            temp = temp.next;
        }
    }
    tail.next = null;
    tail2.next = null;
    System.out.print("even  :  ");
    print(list1.next);
    System.out.println(" ");
    System.out.print("Odd  :  ");
    print(list2.next);

     }

    public static void main(String[] args) {
        Node one = new Node(10) ;
        Node two= new Node(19) ;
        Node three = new Node(18) ;
        Node four = new Node(11) ;
        Node five = new Node(12) ;
        Node six = new Node(13) ;
        Node seven = new Node(15) ;
        Node eight = new Node(16) ;
        Node nine = new Node(17) ;
        
        one.next = two ;
        two.next = three;
        three.next = four ;
        four.next = five ;
        five.next = six ;
        six.next = seven ;
        seven.next = eight ;
        eight.next = nine ;
         
        Node head = one ;
        split(head);
        
        // print(head);

    }
}
