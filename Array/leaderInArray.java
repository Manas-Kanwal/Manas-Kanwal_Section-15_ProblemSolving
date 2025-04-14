import java.util.*;
import java.lang.*;
import java.io.*;

//in this we have to check if elements of right side of selected element are smaller than that element or not .

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        ArrayList<Integer> li = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int[] arr = {16, 17, 4, 3, 5, 2};  
        int n = arr.length;

        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] > max) {
                li.add(arr[i]);
                max = arr[i];
            }
        }

        Collections.reverse(li);  // To restore the original order
        System.out.println(li);
    }
}
