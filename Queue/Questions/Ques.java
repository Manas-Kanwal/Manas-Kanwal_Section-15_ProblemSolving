package Queue.Questions;

import java.util.*;

public class Ques {
    public Queue<Integer> rearrangeQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        int half = n / 2;

        // Step 1: Push first half into stack (to reverse order)
        for (int i = 0; i < half; i++) {
            st.push(q.poll());
        }

        // Step 2: Enqueue the reversed first half back to the queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Step 3: Move second half (originally in order) to the back
        for (int i = 0; i < half; i++) {
            q.add(q.poll());
        }

        // Step 4: Again push first half (now reversed) into the stack
        for (int i = 0; i < half; i++) {
            st.push(q.poll());
        }

        // Step 5: Interleave elements from stack (first half) and queue (second half)
        while (!st.isEmpty()) {
            q.add(st.pop()); // element from first half
            q.add(q.poll()); // element from second half
        }

        return q;
    }
}
