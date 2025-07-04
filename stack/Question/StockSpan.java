package stack.Question;

import java.util.Stack;
//previous greater
public class StockSpan {

    //Brute force
    static int [] StockSpan(int [] arr)
    {
        // Stack <Integer> st = new Stack<>();
        int res[] = new int [arr.length];
        int i = 0 ;
        while(i<arr.length)
        {
            int count = 1 ;
            int j = i-1;
            while (j >= 0 && arr[j] <= arr[i]) {
                count++;
                j--;
            }
            res[i] = count ;
            i++;
            
        }
     
        return res ;
    }
    static void print(int arr[])
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + "");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int arr [] =  {100 , 80 , 60 , 70 , 60 , 75 , 85 };
        print(StockSpan(arr));
        
    }
}
