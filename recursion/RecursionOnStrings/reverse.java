package RecursionOnStrings;

public class reverse {
    static String reverse(String s , int idx)
    {
        String ans = "";
        if(s.length() <= idx)//base case 
        {
            return ans ;
        }
        ans = reverse(s, idx+1);//recursive work 
        ans += s.charAt(idx);//self work 

        return ans ;
    }
    public static void main(String[] args) {
        String s = "abcde";

       System.out.println(reverse(s , 0));
    }
    
}
