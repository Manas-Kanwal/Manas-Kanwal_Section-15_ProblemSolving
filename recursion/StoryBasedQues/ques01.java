package StoryBasedQues;
/*
There are N stones, numbered 0,1,2,...,N-1. For each i (0<i<N), the height of Stone i is hi. 

There is a frog who is initially on Stone 0.

He will repeat the following action some number of times to reach Stone N-1:

If the frog is currently on Stone i, jump to Stone i+1 or Stone i+2.

Here, a cost of hi - hj is incurred, where j is the stone to land on.

Find the minimum possible total cost incurred before the frog reaches Stone N.

Input n= 4

arr[]=10 30 40 20

Output=30
 */

public class ques01 {
    static int frogjump(int arr[] , int n , int i )
    {
        
        if(i==n-1)
        {
            return 0;
        }
        
        //via 1
    
        int opt1 = Math.abs(arr[i]-arr[i+1])+frogjump(arr, n, i+1);

        //via 2
        int opt2 = 0 ;
        if(i+2<n){
        opt2 = Math.abs(arr[i]-arr[i+2])+frogjump(arr, n, i+2);
        }
        int cost = Math.min(opt1, opt2);

        return cost;
    }
   
    public static void main(String[] args) {
        int arr[] = {10,30,40,20};
        System.out.println(frogjump(arr , arr.length , 0));

    }
}
