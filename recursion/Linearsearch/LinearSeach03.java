package Linearsearch;

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
    public static void main(String[] args) {
        int arr [] = {1, 2, 3 , 1, 3, 4 ,6 ,7 , 1,2  };
        int target = 1;
        LinearSearch(arr , target ,0);
    }
    
}
