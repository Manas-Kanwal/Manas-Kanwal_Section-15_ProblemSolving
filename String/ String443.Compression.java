package String;

public class  String443.Compression {
    class Solution {
    public int compress(char[] chars) {
        int index = 0 ;//track the index to assign the charcter and count and till where the array is to be returned .
        int i = 0 ; // used to traverse eholr chars array
        while(i<chars.length)
        {
            char ch = chars[i];//keeps the character . 
            int count = 0 ;//measure the count of a character 
            while(i < chars.length && ch==chars[i])
            {
                count++;
                i++;
            }
            
            chars[index] = ch;
            index++;
            if(count > 1)
            {
                String st = Integer.toString(count);
                for(char cha : st.toCharArray())
                {
                    chars[index] = cha;
                    index++;
                }
            }
            /*
             if(count > 1)
            {
                String st = Integer.toString(count);
                char cha[] = st.toCharArray();
                for(int j = 0 ; j < cha.length; j++)
                {
                    chars[index++] = cha[j];

                } 
            }
             */
        }
        return index;
    }
}
//String.valueOf(int)
//String.valueOf(int)

//to string to integer 
/*
String str = "123";
int num1 = Integer.parseInt(str);     // preferred for primitives
int num2 = Integer.valueOf(str);      // returns Integer object

System.out.println(num1 + 10);  // Output: 133
System.out.println(num2 + 10);  // Output: 133
*/
}
