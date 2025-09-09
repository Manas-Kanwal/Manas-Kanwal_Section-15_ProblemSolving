package Cognizant;
import java.util.*;

public class MinScalarProduct {
    public static int getMinimumSum(int N, int[] A, int[] B) {
        int ans = 0 ;
        //Asscending order
        Arrays.sort(B);
        //Descending Order
        Arrays.sort(A);

        for(int i = 0 ; i<N/2 ; i++){
            int temp = A[i];
            A[i] = A[N-1-i];
            A[N-1-i] = temp ;
        }

        //now solve 
        for(int i = 0 ; i < N ; i++){
            ans += A[i] * B[i] ;
        }

       return ans ;
    }

    // Main method to test
    public static void main(String[] args) {
        // Example 1
        int N1 = 4;
        int[] A1 = {1, 4, 3, 2};
        int[] B1 = {1, 4, 3, 4};
        System.out.println(getMinimumSum(N1, A1, B1)); // Output: 25

        // Example 2
        int N2 = 3;
        int[] A2 = {4, 1, 6};
        int[] B2 = {3, 1, 2};
        System.out.println(getMinimumSum(N2, A2, B2)); // Output: 17
    }
}
