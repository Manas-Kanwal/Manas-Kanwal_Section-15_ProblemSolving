package Cognizant;

import java.util.*;

public class MagicalLibrary {

    // Function to count magical rows
    public static int countMagicalRows(int rows, int cols, int[][] arr) {
        int count = 0;
        boolean hasodd = false ;

        for(int i = 0 ; i < rows ; i++){

            int sum = 0 ;
            for(int j = 0 ; j < cols ; j++){
                if(arr[i][j]%2==0){
                    continue;
                }else{
                    sum+=arr[i][j];
                    hasodd = true ;
                }
            }
            if(hasodd && sum%2==0 ){
                count++;
            }
            
        }

        return count;
    }

    // Main function to test
    public static void main(String[] args) {
        // Example 1
        int rows1 = 3, cols1 = 3;
        int[][] A1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(countMagicalRows(rows1, cols1, A1)); // Expected: 2

        // Example 2
        int rows2 = 3, cols2 = 2;
        int[][] A2 = {
            {2, 4},
            {0, 0},
            {11, 11}
        };
        System.out.println(countMagicalRows(rows2, cols2, A2)); // Expected: 1 (as per problem statement)
    }
}

