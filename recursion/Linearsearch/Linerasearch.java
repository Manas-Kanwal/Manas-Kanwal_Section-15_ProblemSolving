package Linearsearch;
public class Linerasearch {
    
    static boolean Linearsearch(int arr [] , int target , int idx )
    {
        if(idx>=arr.length)
        {
            return false ;
        }

        

        if(arr[idx] == target)
        {
            return true ;
        }

        return Linearsearch(arr, target, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        int target = 1 ;
        int i = 0 ;
        System.out.println(Linearsearch(arr , target , i));
    }
}
