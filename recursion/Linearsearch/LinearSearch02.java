package Linearsearch;
public class LinearSearch02 {
    static int searchIdx(int arr[] , int idx , int target)
    {
        if(idx >= arr.length)//base case 
        {
            return -1;
        }
        if(arr[idx]==target)//self work 
        {
            return idx ;
        }
        
        return searchIdx(arr, idx+1, target);//recursion
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int target = 5 ;
        System.out.println(searchIdx(arr, 0, target));
    }
}