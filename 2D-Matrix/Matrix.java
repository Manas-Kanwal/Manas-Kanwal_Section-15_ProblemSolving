 public class Matrix{
    //pascals triangle
    static void print_arr(int arr[][]){
        for(int i=0 ; i<arr.length ; i++ ){
            for(int j =0 ; j<arr[i].length ;j++){
                System.out.print( arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int n = 5;
        //create a array of n length of rows ;
        int arr[][] = new int[n][];
        for(int i = 0 ; i < n ; i++){
            //in pascals triangle the length of row id one more than the prev length of rows .
            arr[i] = new int [i+1];
        
            arr[i][i] = arr[i][i] = 1 ;
        
        for(int j = 1 ; j<i ; j++ ){
            arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
        }
        }
        print_arr(arr);
        

    }
}