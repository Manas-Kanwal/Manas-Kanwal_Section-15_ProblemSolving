import java.util.*;
class prefixSum {
    static int sumZero(int [] arr )
    {
        HashMap<Integer , Integer> mp = new HashMap<>();
        int ans = 0 ;
        int pref = 0;
        for(int i=0 ; i <arr.length ; i++)
        {
            pref += arr[i];
            if(pref==0)
            {
                ans = i + 1 ;
            }
            if(mp.containsKey(pref))
            {
                int  index = mp.get(pref);
                int sum  = i-index ;
                ans = Math.max(ans, sum);
            }
            else{
                mp.put(pref, i);
            }
          
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,-6,-4,-3,2,-4,10};

        System.out.println(sumZero(arr ));
    }
    
}
