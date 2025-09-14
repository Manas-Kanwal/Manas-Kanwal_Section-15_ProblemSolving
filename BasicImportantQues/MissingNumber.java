package BasicImportantQues;

import java.util.Arrays;

public class MissingNumber {

    // Method to find the missing number in the array
    public static int findMissing(int[] arr, int n) {
        int missing = -1;
        //sort
        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]!=i+1){
                // continue;
                // System.out.println(arr[i] + "=" + i);
                return i+1 ;
            }
        }
    

        return n;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};  // n = 5
        System.out.println(findMissing(arr, 5));  // expected output: 3
    }
}

