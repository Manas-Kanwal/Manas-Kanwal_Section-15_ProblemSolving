package RecursionOnStrings;

public class palindrome {
    static Boolean pal(String str , int left , int right )
    {
        int n = str.length();

        if(left >= right )//base case 
        {
            return true;
        }
        char l = str.charAt(left);
        char r = str.charAt(right);
        if(l!=r)
        {
            return false ;
        }
        return pal(str, left+1, right-1);

        
    }
    public static void main(String[] args) {
        String s = "manas";
        System.out.println(pal(s, 0 , s.length()-1));
    }
    
}
