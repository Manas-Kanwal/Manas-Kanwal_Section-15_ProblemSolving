package Array;
public class arraySumOfSubset {
    static void subsetArr(int arr[] ,int i , int n , int currSum)
    {
       if( i==n )//base case 
        {
            System.out.print(currSum+" , ");
            return ;
        }
       int currEle = arr[i];//keeps track of current element
       
       subsetArr(arr, i+1, n, currSum+currEle);//recursion to add the current element in sum 

      
       subsetArr(arr, i+1, n, currSum);//to simply return without adding 
       

    }
    public static void main(String[] args) {
        int arr[] = { 1,2 ,3};
        
        subsetArr(arr , 0 , arr.length , 0);
    }
}
