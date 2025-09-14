package Cognizant;

public class LibraryBooks01{

    // Function to compute max books
    public static int maxBooks(int N, int K, int[] arr) {
        int totalBooks = 0;

        for(int i = 0 ; i < N ; i++ ){
            if(isPrime(i+1)){
                if(arr[i]>K){
                    totalBooks += K ;
                }else{
                    totalBooks +=arr[i];
                }

            }else{
                continue ;
            }
        }
        

        return totalBooks;
    }

    // Helper to check prime
    public static boolean isPrime(int n) {
        if(n<=1)return false ;
        if(n==2)return true ;
        if(n%2 == 0)return false ;

        for(int i = 3 ; i*i <=n ; i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int N = 4; // shelves
        int K = 5; // max books per shelf
        int[] A = {3, 7, 5, 6};

        int result = maxBooks(N, K, A);
        System.out.println("Maximum books collected: " + result);//10
    }
}
