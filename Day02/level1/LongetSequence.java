// Longest Consecutive Sequence
// Problem: Given an unsorted array, find the length of the longest consecutive elements sequence.
// Hint: Use a hash map to store elements and check for consecutive elements efficiently.

import java.util.HashMap;

public class LongetSequence {
    public static void main(String[] args) {
        int arr[]={15, 13, 12, 14, 11, 10, 9};
         HashMap<Integer, Boolean> mp = new HashMap<>();
        for (int num : arr) mp.put(num, true);
        int longest = 0;
        for (int num : arr) {
            if (!mp.containsKey(num - 1)) {
                int currentNum = num;
                int count = 1;
                while (mp.containsKey(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        System.out.println("length of longest sequence is: "+longest);
    }
    
}

