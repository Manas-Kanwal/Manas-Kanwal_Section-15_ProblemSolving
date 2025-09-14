package Cognizant;

import java.util.*;

public class PenSwitching {

    // Function to count green-to-red switches
    public static int penSwitchCount(int N, int[] arr) {
        int change = 0;
        boolean green = false ;
        if (arr[0] % 2 != 0) {
             green = true;
        }

        for(int i = 1 ; i < N ; i++){
            if(arr[i]%2==0 && green){
                change++;
                green = false ;
            }else if(arr[i]%2!=0){
                green = true ;
            }else{
                green = false;
            }
        }
        return change;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example Test Case 1
        int N1 = 6;
        int[] numbers1 = { 1, 2, 1, 6, 10, 9 };
        System.out.println("Test Case 1 Output: " + penSwitchCount(N1, numbers1));// 2

        // Example Test Case 2
        int N2 = 6;
        int[] numbers2 = { 70, 23, 13, 26, 72, 19 };
        System.out.println("Test Case 2 Output: " + penSwitchCount(N2, numbers2));

        // Additional Test Case 3
        int N3 = 5;
        int[] numbers3 = { 2, 4, 6, 7, 9 };
        System.out.println("Test Case 3 Output: " + penSwitchCount(N3, numbers3));

        // Additional Test Case 4
        int N4 = 7;
        int[] numbers4 = { 1, 3, 5, 8, 10, 1, 2 };
        System.out.println("Test Case 4 Output: " + penSwitchCount(N4, numbers4));
    }
}
