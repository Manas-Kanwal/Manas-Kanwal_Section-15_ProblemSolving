public class printarrayElements {
    static void print(int []arr,int idx){
        int end = arr.length ;
        //base case 
        if(idx==end)
        {
         return;
        }
        //self work 
        System.out.print(arr[idx]);
        //Smaller problem
        print(arr,idx+1);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int idx = 0 ;
        print(arr,idx);
    }
}