package Cognizant ;
public class Cryptographer {

    // Method to decrypt the given string
    public static String decrypt(String S) {
       StringBuilder sb = new StringBuilder();
        char arr[] = S.toCharArray();
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]=='a'){
                sb.append('z');
            }
            else{
                sb.append((char)(arr[i]-1));
            }
        }
        return sb.toString(); // placeholder
    }

    public static void main(String[] args) {
        String input1 = "bcd";   // sample input
        System.out.println(decrypt(input1));  // expected output: abc
    }
}
