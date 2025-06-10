public class ques03 {
    
    public static boolean isomorphic(String str1 , String str2)
    {
        if(str1.length()!=str2.length())
        {
            return false;
        }
        HashMap<Character , Character> mp = new HashMap <>();
        for(int i = 0 ; i < str1.length() ; i++ )
        {
            if(!mp.containsKey(str2.charAt(i)))
            {
                mp.put(str1.charAt(i),str2.charAt(i));
            }
            else
            {
                if(mp.getkey(str2.charAt(i)));

            }
        }
    }
    public static void main(String[] args) {
        //isomorphic string
        String str1 = "abcdefg";
        String str2 = "nmjklpi"
        isomorphic(str1 , str2);
    }
}
