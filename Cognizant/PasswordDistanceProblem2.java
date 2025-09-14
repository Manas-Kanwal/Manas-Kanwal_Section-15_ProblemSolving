package Cognizant;

public class PasswordDistanceProblem2 {

    // Function to calculate maximum distance between non-similar characters
    public static int maxPasswordDistance(String s) {
        int n = s.length();

        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return j - i; // Found maximum distance from ends
            } else {
                j--; // Move the right pointer left
            }
        }

        return 0; // All characters are same or no non-similar pair
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
        System.out.println(maxPasswordDistance(s3)); // Expected: 10

        // Extra tricky example
        String s4 = "aaabbbbbc";
        System.out.println(maxPasswordDistance(s4)); // Expected: 8
    }
}


