package String;

public class Anagram {
    //characters of two strings should be same they can be shuffled but they should be same 
    //a="abcd" , b = "cdba" they are anagram

    static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        int freq [] = new int [26];
        for(int i = 0 ; i<s.length() ; i++)
        {
            char ch = s.charAt(i);
            int ascii = ch - 'a';
            freq[ascii] += 1;//adding 1 to the values 


            //subtracting values of second strings 
            char cha = t.charAt(i);
            int asci = cha - 'a';
            freq[asci] -= 1;//subtracting 1 to the values 

        }
        for(int i = 0 ; i < freq.length ; i++)
        {
            if(freq[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdba";
        System.out.println(isAnagram(s1,s2));
    }
} 

