package RecursionOnStrings;
import java.util.ArrayList;

public class Subsequen {
    static ArrayList<String> sub(String s )
        {
            ArrayList<String> li= new ArrayList<>();
            if(s.length()<=0) // base case 
            {
                li.add("");
                return li;
            }
            char fir = s.charAt(0);// first index 
            ArrayList<String> smallans = sub(s.substring(1)); // recursion and triming the index by substring 

            for(String str : smallans)// adding tp the main list (self work )
            {
                li.add(str);
                li.add(fir + str);

            }

            return li;
        }
public static void main(String[] args) {
    String s = "abc";
    
    System.out.println(sub(s)); 
}
}
