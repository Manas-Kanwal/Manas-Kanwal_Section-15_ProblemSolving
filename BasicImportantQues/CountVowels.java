package BasicImportantQues;

public class CountVowels {

    // Method to count vowels in a given string
    public static int countVowels(String input) {
        int count = 0;

        input = input.toLowerCase();
        for(int i = 0 ; i < input.length() ; i++){
            char curr =  input.charAt(i);
            if(curr=='a'||curr=='e'||curr=='i'||curr=='o'||curr=='u'){
                count++;
            }else{
                continue;
            }
        }

        return count; 
    }

    public static void main(String[] args) {
        String input1 = "cognizant";  // sample input
        System.out.println(countVowels(input1)); // expected output: 3
    }
}
