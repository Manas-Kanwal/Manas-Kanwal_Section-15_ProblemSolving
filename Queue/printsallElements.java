package Queue;

import java.util.*;

import Array.sumOfelementsInArray;

public class printsallElements {

    public static void main(String[] args) {

        Queue <Integer> pq = new LinkedList<>();
        Queue <Integer> helper = new LinkedList<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        int i = 0;
        while(!pq.isEmpty())
        {
            System.out.print(pq.peek() + " ");
            helper.add(pq.poll());
            i++;
        }
        while(!helper.isEmpty())
        {
            
            pq.add(helper.poll());
            i++;
        }
        
    }   
    
}