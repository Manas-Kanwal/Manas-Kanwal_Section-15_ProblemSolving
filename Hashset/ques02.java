import java.util.*;
public class ques02 {
//You are given n distinct pairs. Each pair is numbered from 1 to n. All these pairs are initially put in a bag.
//You need to pair up each number. You take numbers one by one from the bag and for each number you look whether the pair of 
//this number has already been taken out of the bag, or not. If not (that means the pair of this number is still in the bag),
//you put the current number on the table in front of him. Otherwise,
//you put both numbers from the pair aside. Print the maximum number of numbers that were on the table at the same time.

static int table(int [] bag )
{
    HashSet <Integer> st = new HashSet<>();
    int max = 0 ;
    for(int i = 0 ; i < bag.length ; i++)
    {
        
        if(st.contains(bag[i]))
        {
            st.remove(bag[i]);
        }
        else 
        {
            st.add(bag[i]);
            max = Math.max(max,st.size());
        }
    }
    return max ;
}

public static void main(String[] args) {
    int nums [] = {1,1} ;
    int  ans = table(nums);
    System.out.println("ans is : " + ans);
}
}

//  static int table(int[] bag) {
//         HashSet<Integer> st = new HashSet<>();
//         int max = 0;
//         for (int num : bag) {
//             if (st.contains(num)) {
//                 st.remove(num); // pair completed
//             } else {
//                 st.add(num); // place on table
//                 max = Math.max(max, st.size());
//             }
//         }
//         return max;
//     }
