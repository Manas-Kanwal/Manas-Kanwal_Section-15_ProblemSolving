package Cognizant;
import java.util.*;

public class AlexReadingProblem {

    // Function to calculate maximum number of books Alex can read
    public static int maxBooks(int[] arr, int N, int size) {
        int count = 0;

        //sort
        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length ; i++){
            if(N -arr[i] >= 0)
            {
                N = N -arr[i];
                count++;
            }
        }
        return count;
    }

    // Main function to test
   public static void main(String[] args) {
    // Harder Example
    int[] A2 = {7, 2, 5, 10, 3, 1, 8, 4};
    int N2 = 15;   // total hours available
    int size2 = A2.length;

    System.out.println(maxBooks(A2, N2, size2)); 
    // Expected: 5
    // Explanation:
    // Sorted times: [1, 2, 3, 4, 5, 7, 8, 10]
    // Best choice = 1 + 2 + 3 + 4 = 10 hours → 4 books
    // (If we add 5 → total = 15 → still okay, so actually 5 books)
    // Final Answer = 5
}

}

