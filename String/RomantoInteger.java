import java.util.*;
public class RomantoInteger {

    public int romanToInt(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int ans = 0 ;

        for(int i = 0 ; i < str.length(); i++)
        {
         

            if(i+1<str.length() && map.get(str.charAt(i))<map.get(str.charAt(i+1)))
            {
                ans-=map.get(str.charAt(i));//if roman numeral i+1 is greater than i then subtract the value 
            }
            else
            {
                ans+=map.get(str.charAt(i));//else add the value 
            }
        }
        return ans;

    }

}
