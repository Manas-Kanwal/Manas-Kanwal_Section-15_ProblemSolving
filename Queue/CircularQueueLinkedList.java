package Queue;

public class CircularQueueLinkedList {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        node head = null;
        node tail = null;
        int size = 0;

        public void add(int val) {
            node temp = new node(val);
            if (size == 0) {
                head = tail = temp;
                head.next = tail;
                size++;

            } else {
                tail.next = temp;
                tail = tail.next;
                tail.next = head;
                size++;
            }
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int val = head.data;
            head = head.next;
            tail.next = head;
            size--;
            return val;

        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }

        public boolean isEmpty() {
            if (size == 0) {
                return true;
            } else {
                return false;
            }
        }

        public int size() {
            return size;
        }

        public void display() {
            node temp = head;//starts with head
            while (true) {
                System.out.print(temp.data + " ");
                temp = temp.next;
                if (temp == head)//ends with head
                    break;
            }
           
        }

    }

    public static void main(String[] args) {
        Queue pq = new Queue();
        pq.add(12);
        pq.add(11);
        pq.add(10);
        pq.add(9);
        pq.display();
        pq.remove();
        pq.display();
        System.out.println(pq.peek());
        System.out.println(pq.isEmpty());
        System.out.println(pq.size());
    }
}
