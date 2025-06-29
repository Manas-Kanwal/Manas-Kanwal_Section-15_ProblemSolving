package BasicImportantQues;
//to check prime numbers 

public class primeNum {
    static boolean primeNum(int n )
    {
        if(n<=1)
        {
            return false;
        }
        for(int i = 2 ; i*i<=n ; i++ )
        {
            
            if(n%i==0)
            {
               return false;
            }
        }
        return true;
       
    }
    public static void main(String[] args) {
        System.out.println(primeNum(1));
        
    }
}
