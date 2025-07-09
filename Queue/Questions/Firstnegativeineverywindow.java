package Queue.Questions;

import java.util.*;

public class Firstnegativeineverywindow {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        int n = arr.length;
        Queue<Integer> pq = new LinkedList<>();
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                pq.add(i);
            }
        }

        int i = 0;
        int j = k - 1;
        while (j < n) {

            while (!pq.isEmpty() && pq.peek() < i) {
                pq.poll();
            }
            if (!pq.isEmpty() && pq.peek() >= i && pq.peek() <= j) {
                li.add(arr[pq.peek()]);
            } else {
                li.add(0);
            }
            i++;
            j++;
        }
        return li;
    }
}
