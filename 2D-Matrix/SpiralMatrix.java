public class spiral {
    static void spiral(int arr[][] , int col , int row ){
        int left = 0 ;
        int right = col -1;
        int top = 0 ;
        int bottom = row -1 ;
        int total = 0 ;

        while (total < row * col){
            for(int j = left ; j<=right ; j++){
                System.out.print(arr[top][j] + " ");
                total++;
            }
            top++;
            for (int i = top ; i<=bottom ;i++){
                System.out.print(arr[i][right] + " ");
                total++;
            }
            right--;
            for(int j = right ; j>=left ; j--){
                System.out.print(arr[bottom][j] + " ");
                total++;
            }
            bottom--;
            for(int i = bottom ; i>= top ;i--){
                System.out.print(arr[i][left] + " ");
                total++;
            }
            left++;
            

        }
    }
    // static void print(int arr[][]){
    //     for(int i = 0 ; i < arr.length ; i++){
    //         for (int j =0 ; j<arr.length ; j++){
    //             System.out.println(arr);
    //         }
    //     }
    // }
    public static void main(String[] args) {
        int row = 4 ; 
        int col = 4 ;
        int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        spiral(arr , col , row );
    }
}
