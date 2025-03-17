// rotate a matrix 90 degree 
public class Matrix_fourth {
    static void print(int [][]arr, int row ,  int col){
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j <arr.length ; j++ ){
                System.out.print(arr[i][j]);

            }
            System.out.println(" ");
        }

    } 
    static int[][] transpose(int [][]arr , int row , int col ){
        for(int i = 0 ; i <row ; i++){
            for(int j = i ; j < col ; j++){
                int temp  = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp ;
            }
        }
        return arr;
    }
    static int[][] reverse(int[][]arr , int row , int col ){
        for(int i = 0 ; i<row ; i++){
            int j = 0 ;
            int end = col-1 ; 
            while(j<end){
                int temp = arr[i][j];
                arr[i][j] = arr[i][end];
                arr[i][end] = temp;
                j++;
                end--;

            }
        }
        return arr ;

    }
    static void rotate(int arr[][],int row , int col ){
        transpose(arr, row, col);
        reverse(arr, row, col);
        print(arr, row, col);
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}}; 
        rotate(arr,3,3);
    }
}