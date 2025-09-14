package Cognizant;

public class PasswordDistanceProblem {

    // Function to calculate maximum distance between non-similar characters
    public static int maxPasswordDistance(String s) {
        int n = s.length();
        
        int i = 0 ; 
        int j = n-1 ;
        while(i < j ){
            char start = s.charAt(i);
            char end = s.charAt(j);
            if(start != end){
                return Math.abs(j-i);
            }

            int tempj = j;
            int tempi = i;

            while(i < tempj && s.charAt(i)==s.charAt(tempj)){
                tempj--;
            }
            if(i < tempj )return Math.abs(tempj - i );

            while(tempi < j && s.charAt(tempi)==s.charAt(j)){
                tempi++;
            }
            if(j > tempi )return Math.abs(j - tempi );

            i++;
            j--;

        }
        return 0; // placeholder
    }

    // Main function to test
    public static void main(String[] args) {
        // Example 1
        String s1 = "abc10";
        System.out.println(maxPasswordDistance(s1)); // Expected: 4

        // Example 2
        String s2 = "bbbb";
        System.out.println(maxPasswordDistance(s2)); // Expected: 0

        // Tougher Example (mixed letters and digits)
        String s3 = "a9b8c7d6e5f";
        // Here: first = 'a' at index 0, last = 'f' at index 10, both different
        // Expected: 10
        System.out.println(maxPasswordDistance(s3)); 
    }
}
