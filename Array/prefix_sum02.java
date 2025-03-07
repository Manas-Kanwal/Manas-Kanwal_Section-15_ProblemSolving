package Array;
// find the prefix sum from l to r in an array in which l and r are included 
public class prefix_sum02 {
    static int sum(int left , int right , int [] arr ){
        int sum = 0;
        for(int i =left ; i<=right ; i++ ){
            sum+=arr[i];
        }
        return sum ;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(sum(0 , 4 , arr));
    }
    
}