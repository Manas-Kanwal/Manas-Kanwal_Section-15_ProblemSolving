package RecursionOnStrings;

public class removeOccurances {

    static String occurances(String s , int i  )
    {

        String ans = "";
        if(i>=s.length() ) // base case 
        {
            //base case
            return "" ;
        }
        ans = occurances(s, i+1); // recursion
        
        if(s.charAt(i)!='a')//self work 
        {
            return ans += s.charAt(i);
        }
        else{
            return  ans ;
        }
       

    }
    public static void main(String[] args) {
        String s = "abcdasfakalha";
        System.out.println(occurances(s, 0));
    }
}
