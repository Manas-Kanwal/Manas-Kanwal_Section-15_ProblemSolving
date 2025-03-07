package Array;
import java.util.Scanner;

public class prefix_Sum01 {
    static void printArr(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        // int arr[] = {1,3,2,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter arr length :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ; i<arr.length ; i++){
            System.out.print("enter " + i + " element");
            arr[i] = sc.nextInt(); 
        }
        // int prefix [] = new int [n];
        
        // for(int i = 0 ; i <arr.length ; i++){
        //     if(i==0){
        //         prefix[i] = arr[i];
        //     }
        //     if(i>=1){
        //     prefix[i] = prefix[i-1] + arr[i];
        // } }

        //without using another array 
        for(int i =0 ; i<arr.length ; i++){
            if(i>=1){
            arr[i] = arr[i] + arr[i-1];
            }
        }
        printArr(arr);
    }
    
}
