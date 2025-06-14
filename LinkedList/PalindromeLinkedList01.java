/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
        {
            return true ;
        }
        ListNode temp = head.next ;
        ListNode newLL = new ListNode (head.val);
        ListNode tempnew = newLL;
        while (temp != null) // creating a new Linked List .
        {
           tempnew.next = new ListNode(temp.val);
           tempnew = tempnew.next;
           temp=temp.next;
            
        }
        tempnew = newLL;
        ListNode reversed = rev(head);//reversing a Linked List
        ListNode temp2 = reversed;
        while (temp2 != null && tempnew != null)//checking their value is equal or not .
        {
            if(temp2.val != tempnew.val) // if not equal return false not a pallindrome . 
            {
                return false ;
            }
            temp2 = temp2.next;
            tempnew = tempnew.next;
        }
        return true ; // is a palindrome .

        
    }
    static  ListNode rev(ListNode head )
    {
        ListNode curr = head ;
        ListNode prev = null;
        ListNode agla = null;
        while (curr != null)
        {
            agla = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = agla ;
        }
        return prev ;
    }
}