package Array;
public class sumOfelementsInArray {
    static int add(int arr[] , int index )
    {   int n = arr.length;
        //base case
        if(index==n-1)
        {
            return arr[index];
        }
        //smaller problem
        int sum = add(arr, index+1);
        //self work
        return sum + arr[index];
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,20,1};
        int index = 0 ;
        System.out.println(add(arr,index));
    }
}
