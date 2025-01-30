// Check for a Pair with Given Sum in an Array
// Problem: Given an array and a target sum, find if there exists a pair of elements whose sum is equal to the target.
// Hint: Store visited numbers in a hash map and check if target - current_number exists in the map.


import java.util.*;
import java.util.HashMap;
public class TargetSum {
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
          if(flag) System.out.println("pair is present ");
          else System.out.println("pair is not presnt ");

    }
}

