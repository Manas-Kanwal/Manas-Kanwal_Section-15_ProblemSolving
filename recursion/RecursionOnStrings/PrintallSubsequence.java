package RecursionOnStrings;
public class PrintallSubsequence {
    static void subt(String str ,String curr)
        {
            if(str.length() == 0 )// base case 
            {
                System.out.println(curr);
                return ;
            }
            char ch = str.charAt(0);
            String rem = str.substring(1);
            //it includes current 
            //curr character chooses to be a part of ans 
            subt(rem,curr+ch );

            //it do not include current character 
            // not chooses to be a part of current ans 
            subt(rem,curr);
        }
    public static void main(String[] args) {
        String s = "abc";
        String curr = "";
        subt(s, curr);
        
    }
}
