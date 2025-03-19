public class findMaxinArr {
    static int max(int arr[] , int idx)
    {   
        int n = arr.length;
        //base case
        if(idx==n-1)
        {
            return arr[idx];
        }
        //small prob
        int maxii = max(arr,idx+1);
        //comparing 
        if(arr[idx]>maxii)
        {
            maxii = arr[idx];
        }
        return maxii;
    }

    public static void main(String[] args) {
        int arr[] = {3,10,3,2,5};
        int index = 0 ;
        System.out.println( max(arr,index));
    }
}