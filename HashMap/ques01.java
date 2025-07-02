import java.util.*;

public class ques01 {

    public static void main(String[] args) {
        //find the max freq of an Element in an array
        HashMap<Integer , Integer > mp = new HashMap<>();
        int arr[] = {1,2,3,4,3,2,4,1,4,5,6,4,5,4};
        for (int ele : arr)
        {
            if(!mp.containsKey(ele))
            {
                mp.put(ele , 1);
            }
            else 
            {
                mp.put(ele , mp.get(ele)+1);
            }
        }
        System.out.println(mp.entrySet());
        int max_value = 0;
        int ans = -1;

        for(var i : mp.entrySet())
        {
            if(max_value<i.getValue())
            {
                max_value = i.getValue();
                ans = i.getKey();
            }
        }
        System.out.println(ans);
        

    }
}