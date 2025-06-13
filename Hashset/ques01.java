import java.util.HashSet;

public class ques01 {
    public static int longestConsecutive(int[] nums)
    {
        HashSet<Integer> st = new HashSet <>();
        for( int num : nums)
        {
            st.add(num);
        }
        int maxLen = 0 ;
        for(int num : st)
        {
            int len = 1 ;
            if(!st.contains(num-1))//starting point 
            {
                int currentNum = num;
                
               
                while(st.contains(currentNum+1))
                {
                    len++;
                    currentNum++;
                }
                
            }
            maxLen = Math.max(maxLen , len );
            
        }
        return maxLen;
    }
    public static void main(String[] args) {
        //Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
        int nums[] = {100,4,200,1,3,2} ;
        int ans  = longestConsecutive(nums);
        System.out.println(ans);

    }
}
