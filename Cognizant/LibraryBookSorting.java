package Cognizant ;
import java.lang.reflect.Array;
import java.util.*;

public class LibraryBookSorting {

    // Function to solve the problem
    public static int minBooksToMove(int N, String S) {
        int count = 0 ;
        
        char [] arr =  S.toCharArray();
        char [] sorted = S.toCharArray();
        Arrays.sort(sorted);

        for(int i = 0 ; i < N ; i++){
            if(arr[i] != sorted[i]){
                count++;
            }
        }
        return count ; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int N = sc.nextInt();
        String S = sc.next();

        // Function call
        int result = minBooksToMove(N, S);

        // Output
        System.out.println(result);

    }
}
