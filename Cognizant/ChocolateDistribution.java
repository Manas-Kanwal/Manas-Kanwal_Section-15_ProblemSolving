package Cognizant ;
import java.util.*;

public class ChocolateDistribution {

    // static final int MOD = 1000000007;

    // Function to calculate total chocolates
    public static long solve(int N) {
        int ans  = 0 ;
        for(int i = 1 ; i <= N ; i++){
            int chocolate = i ;
            int left = i -1 ;
            int right = i + 1 ;

            if(left<1){
                left = N ;
            }
            if(right>N){
                right = 1 ;
            }
            if(right%5 == 0 || left%5 == 0){
                chocolate+=2;
            }
            ans += chocolate ;
        }
        return ans;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(solve(N));
    }
}
