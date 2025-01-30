// Two Sum Problem
// Problem: Given an array and a target sum, find two indices such that their values add up to the target.
// Hint: Use a hash map to store the index of each element as you iterate. Check if target - current_element exists in the map.


import java.util.*;
import java.util.HashMap;
public class TargetSum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          System.out.print("enter the size of the aarray: ");
          int n=sc.nextInt();
          System.out.println("enter array elements : ");
          int arr[]=new int[n];
          for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
          }
          System.out.print("enter target sum: ");
          int target=sc.nextInt();
          boolean flag=false;
          HashMap<Integer,Integer>mp=new HashMap<>();
          int ans=0;
          int i;
          for( i=0;i<n;i++){
            if(mp.containsKey(target - arr[i])){
                  flag=true;
                  break;
                }
            mp.put(arr[i],i);
          }
          if(flag) System.out.println("pair is present, indexes are "+ mp.get(target-arr[i]) + " and "+i );
          else System.out.println("pair is not presnt ");

    }
}

