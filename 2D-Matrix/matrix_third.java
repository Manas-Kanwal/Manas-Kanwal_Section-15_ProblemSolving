public class matrix_third {
    static void print_arr(int arr[][]){
        for(int i=0 ; i<arr.length ; i++ ){
            for(int j =0 ; j<arr[i].length ;j++){
                System.out.print( arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    static void reverse(int arr[][],int r ,int c){
        for(int i = 0 ; i<r ; i++){
            int j =0 ;
            int end = c-1;
                while(j<end){
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][end];
                    arr[i][end] = temp ;
                    end--;
                    j++;
                    
                
            }
        }
        print_arr(arr);
    }
    
    public static void main(String[] args) {
        int r ,c ;
        r = 2 ;
        c = 3 ;
        int arr[][] = {{1,2,3},{4,5,6}};
        reverse(arr,r , c);
    }
       

        
    
}
