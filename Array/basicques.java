public class basicques {
    static void end_one(int arr[]){
        int j = 0  ;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] != 1){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp ;
                j++;
            }
        }
        print(arr);
    }
    static void end_two(int arr[]){
        int i=0;
        int j = arr.length -1  ;
        while(i<j){
            if(arr[i] == 1 && arr[j] == 0 ){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp ;
                j--;
                i++;
            }
            if(arr[i] == 0){
                i++;
            }
            if(arr[i]==1){
                j--;
            }
        }
        print(arr);
    }
    static void print(int [] arr){
        for(int i = 0 ; i<arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,1,0,0,1,0};
        end_two(arr);
    }
}