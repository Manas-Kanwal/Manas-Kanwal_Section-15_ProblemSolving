
public class matrix_second {
    static void print_arr(int arr[][]){
        for(int i=0 ; i<arr.length ; i++ ){
            for(int j =0 ; j<arr.length ;j++){
                System.out.print( arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    static int[][] mul(int arr[][],int r , int c , int nums[][] , int row ,int col){
        int ans [][] = new int [r][col];
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j<col ;j++){
                for(int k =0 ; k<c ; k++){
                    ans[i][j] += (arr[i][k]*nums[k][j]);
                }
            }
            
        }
        return ans;
        

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        //for array input 
        //System.out.println("for Rows : ");
        // int r = sc.nextInt();
        // System.out.println("for col : ");
        // int c = sc.nextInt();
        // int arr[][] = new int[r][c];
        // for(int i = 0 ; i<r ; i++){
        //     for(int j =0  ; j<c ; j++){
        //         System.out.println("Enter elements of an array : ");
        //         arr[i][j] = sc.nextInt(); 
        //     }
        //     System.out.println();
        // }
        int r ,c ,row,col;
        r = 2 ;
        c = 2 ;
        row = 2 ; 
        col = 2 ;
        int arr[][] = {{1,3},{4,5}};
        int nums [][] = {{1,2},{3,4}};

        
       
        print_arr(mul(arr,r,c,nums,row,col));

    }

}