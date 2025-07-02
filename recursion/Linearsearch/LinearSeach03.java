package Linearsearch;

import java.util.ArrayList;

public class LinearSeach03 {
    //return all indexes of an array 
    static void LinearSearch(int []arr , int target , int idx)
    {
        int n  = arr.length ; 
        if(idx==n-1)
        {
            return ;
        }
        if(target==arr[idx])
        {
            System.out.print(idx);
            System.out.print(" ");
        }
        LinearSearch(arr , target , idx+1);

    }

    static ArrayList<Integer> LinearSearch02(int []arr , int target , int idx)
    {
        ArrayList<Integer> li = new ArrayList<>();
        int n  = arr.length ; 
        if(idx>n-1)
        {
            return li ;
        }
        if(target==arr[idx])
        {
           li.add(idx);
        }
        li.addAll(LinearSearch02(arr , target , idx+1));
        return li;
    }
    public static void main(String[] args) {
        int arr [] = {1, 2, 3 , 1, 3, 4 ,6 ,7 , 1,2  };
        int target = 1;
        LinearSearch(arr , target ,0);
        System.out.println(LinearSearch02(arr, target, 0));
    }
    
}
