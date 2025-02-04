package chall;

import java.util.*;

public class Problem1 {
    public static int findMissingPositive(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1)
                return i + 1;
        }
        
        return n + 1;
    }

    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1, 5, 6};
        int target = 5;

        int missing = findMissingPositive(arr.clone());
        System.out.println("First missing positive integer: " + missing);

        int index = binarySearch(arr.clone(), target);
        System.out.println("Index of target: " + index);
    }
}
