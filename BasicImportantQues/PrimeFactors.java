package BasicImportantQues;

import java.util.ArrayList;

public class PrimeFactors {
    static int[] factor(int num )//to find all factors of a num 
    {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i = 1; i<=num ; i++)
        {
            if(num%i==0)
            {
                li.add(i);
            }
        }
        int arr [] = new int[li.size()];
        for(int i = 0 ; i<li.size() ; i++)
        {
            arr[i] = li.get(i);
        }
        return arr;
    }

    static int[] primeNum(int arr[])
    {
        ArrayList<Integer> li = new ArrayList<>();
        for(int num : arr)
        {
            if(num < 2)
            {
                continue ;
            }

            boolean isPrime = true;

            for(int i = 2 ; i*i <= num ; i++)
            {
                if (num % i == 0)
                    {
                        isPrime = false;
                        break;
                    }
            }
            if(isPrime)
                {
                    li.add(num); //  add the number itself if it's prime

                }
            
        }
        int ans [] = new int [li.size()];
        for(int i = 0 ; i < li.size() ; i++ )
        {
            ans[i] = li.get(i);
        }
        return ans ;
    }

    static void print(int arr[])//to print 
    {
        for (int num : arr) {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        int num = 555;
        print(primeNum(factor(num)));


    }
    
}
