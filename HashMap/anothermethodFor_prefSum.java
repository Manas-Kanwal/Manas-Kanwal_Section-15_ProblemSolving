import java.util.HashMap;

public class anothermethodFor_prefSum {
    
    static int maxSubArrayLen(int[] arr, int k)
{
    HashMap<Integer , Integer> mp = new HashMap<>();
    int ans = 0;
    int pref = 0;

    for(int i = 0; i < arr.length; i++)
    {
        pref += arr[i];

        if(pref == k)
        {
            ans = i + 1;
        }

        if(mp.containsKey(pref - k))
        {
            int len = i - mp.get(pref - k);
            ans = Math.max(ans, len);
        }

        if(!mp.containsKey(pref)) {
            mp.put(pref, i);
        }
    }

    return ans;
}
public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,-6,-4,-3,2,-4,10};
    int k = 0 ;
    int ans  = maxSubArrayLen(arr,k );
    System.out.println(ans);
}

}
