 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null||head.next==null)
        {
            return null ;
        }

        ListNode zero = new ListNode(0);
        zero.next = head;
        int length = 0 ;
        ListNode temp = head ;
        while (temp != null)
        {
            length ++;
            temp = temp.next;
        }
        
        int pos = length - n ;
        temp = zero;
        
        for(int i = 0 ; i<pos ; i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        
        
        return zero.next;
    }
}