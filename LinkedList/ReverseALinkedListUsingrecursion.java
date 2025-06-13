import org.w3c.dom.Node;

public class ReverseALinkedListUsingrecursion {

  public  static class Node {
      int val;
      Node next;
      Node() {}
    Node(int val) { this.val = val; }
      Node(int val, Node next) { this.val = val; this.next = next; }
  }
 

    public static Node reverseList(Node head) {
        if(head == null || head.next == null )
        {
            return head;
        }
        Node newhead = reverseList(head.next);//recursive call
        head.next.next = head;//self work (reversing the link)
        head.next = null;//self work (for breaking the orignal link)
        return newhead;
    }
    static void print(Node head)
     {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
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
        print(reverseList(one));        
    }
}


