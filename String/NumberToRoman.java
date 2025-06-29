package String;


public class NumberToRoman {
    static String intToRoman(int num) {
        // int val[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        // int symbol[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int val[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String symbol[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    int times = 0 ;
    String sym = "";
            for(int i = 0 ; i<val.length ; i++)//it will iterate whole array and find exact value to be replaced 
            {
                if(num==0)//important early exit if num is 0 
                {
                    break;
                }
                times = num/val[i];//it will find the exact smaller value than num and find how many times it can be added to string  
                while(times!=0)//adding to string many times as we want 
                {
                    sym += symbol[i];
                    times--;
                }
                num = num%val[i];//making it smaller as we have converted it to roman  

            }
            return sym ;

        
    }
    public static void main(String[] args) {
        System.out.println(intToRoman(10));
    }
}
    

