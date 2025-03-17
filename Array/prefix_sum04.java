public class prefix_sum04 {
    static boolean part(int[]arr){
        boolean flag = false ;
        int Total_sum = 0 ;
        int n = arr.length;
        for(int i = 0 ; i<n ;i++){
            if(i>=1){
                arr[i] = arr[i] +arr[i-1];//prefix array created 
            }
        }
        Total_sum = arr[n-1];
      
        for(int i = 0 ; i<arr.length ; i++){
            if (Total_sum - arr[i] == arr[i]){
                flag = true;
            }
        }
        

        return flag;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,6,4,5};
        
        System.out.println(part(arr));
       
     
    }
}