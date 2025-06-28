public class gcd {
    // static int gcd (int a , int b )
    // {
    //     int ans = 0 ;
        
    //     if(a%b==0)
    //     {
    //         return ;
    //     }
        
    //     return ans ;

    // }
    static int gcd (int a , int b )
    {
        int rem ;
        while(a%b!=0)
        {
            rem = a%b;
            a = b ;
            b = rem ;
        }
        return b;//hcf or gcd
    }
    static int gcdrec(int a , int b)
    {
        if(a==0)
        {
            return b; //base case 
        }
        int ans = gcd(b , a%b);//recursion work
        return ans ;
    }
    static int fibo(int a)
    {
        if(a==0||a==1)
        {
            return a;
        }
        int one = fibo(a-1);
        int two = fibo(a-2);
        int ans = one + two ;
        
        return ans;
    }
    static int lcm(int a , int b )
    {
        if(b==0)
        {
            return b;
        }
        int one = gcdrec(a, b);
        int ans = (a*b)/one;
        return ans ;

    }
    public static void main(String[] args) {
        int x = 10 ;
        int y = 14 ;
        int na = gcd(x , y );
        // System.out.println(na);
        // System.out.println(gcdrec(x, y));

        // for(int i = 0 ; i <=10 ; i++)
        // {
        // System.out.print(fibo(i));
        // System.out.print("-->"); }
        System.out.println(lcm(x,y));
    }
    
}
