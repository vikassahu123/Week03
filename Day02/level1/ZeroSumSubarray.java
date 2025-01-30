
// Find All Subarrays with Zero Sum
// Problem: Given an array, find all subarrays whose elements sum up to zero.
// Hint: Use a hash map to store the cumulative sum and its frequency. If a sum repeats, a zero-sum subarray exists.

import java.util.ArrayList;
import java.util.HashMap;
public class ZeroSumSubarray {
    public static void print(int st,int end,int arr[]){
      ArrayList<Integer>ans=new ArrayList<>();
              for(int i=st;i<=end;i++){
                 ans.add(arr[i]);
        }
        System.out.println(ans);
        System.out.println();
    }
    public static void main(String[] args) {
        // 0, -1, 8, -5, -3, -7, 4, 2, 1
        // 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7
        int arr[]={6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        int n=arr.length;
        HashMap<Integer,ArrayList<Integer>>mp=new HashMap<>();
         ArrayList<Integer>c=new ArrayList<>();
         c.add(-1);
        int temp=0;
          mp.put(temp,c);
        for(int i=0;i<n;i++){
            ArrayList<Integer>curr=new ArrayList<>();
            temp+=arr[i];
          if(mp.containsKey(temp)){
            curr=mp.get(temp);
            for(int it:curr){
             int st=it+1;
             int end=i;
             print(st,end,arr);
          }
        }
        curr.add(i);
        mp.put(temp,curr);
          
        }
    }
    
}
