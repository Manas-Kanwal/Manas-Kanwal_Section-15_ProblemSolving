package stack.Question;
import java.util.*;

public class RemoveConsecutiveSubsequences {
    static int[] sub(int [] arr)
    {
        Stack <Integer> st = new Stack <>();
        
        int i = 0 ;
        while (i<arr.length)
        {
            int count = 1 ;
            while(i + count < arr.length && arr[i]==arr[i+count])
            {
                count ++;
            }
            if(count ==1)
            {
                st.push(arr[i]);
                i++;
                
            }
            else 
            {
                i+=count;
            }
        }
        int ans [] = new int [st.size()];
        for(int j =0 ; j<ans.length ; j++)
        {
            ans[j] = st.pop();
        }
        return ans ;
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
        int arr[] = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        print(sub(arr));
    }
}
