package Queue.Deque;
import java.util.*;
public class first {
    public static void main(String[] args) {
        Deque <Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addFirst(4);
        System.out.println(dq);
        dq.addLast(0);
        System.out.println(dq);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq.peek());//peef from first
        dq.add(7);//add last
        dq.add(9);
        System.out.println(dq);
        dq.remove();//remove first
        System.out.println(dq);
    }
}
