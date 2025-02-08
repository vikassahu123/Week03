import java.util.*;
public class Problem_1 {
    public static boolean linearSearch(int []arr,int target){
        for(int it:arr) {
            if(it==target) return true;
        }
        return false;
    }

    public static boolean binarySearch(int []arr ,int target){
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid] >target) end=mid-1;
            else if(arr[mid] <target) st=mid+1;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int []arr1=new int[1001];
        int[] arr2=new int[10001];
        int[] arr3=new int[100001];

        for(int i=0;i<arr1.length;i++) arr1[i]=rand.nextInt(997);
        for(int i=0;i<arr2.length;i++) arr2[i]=rand.nextInt(9997);
        for(int i=0;i<arr3.length;i++) arr3[i]=rand.nextInt(99997);

        int target=998;
        arr1[1000]=target;
        arr2[10000]=9998;
        arr3[100000]=99998;

        System.out.println("Performing Search operations on dataset of size 1001");
        long start = System.nanoTime();
        if(linearSearch(arr1,target)) System.out.println("Target is found using linear search");
        else System.out.println("Target is not present using linear search");
        long end = System.nanoTime();
        long time1 = end - start;
        System.out.println("Linear search took " + time1 / 1000000.0 + " ms\n");

        Arrays.sort(arr1);
        start = System.nanoTime();
        if(binarySearch(arr1,target)) System.out.println("Target is present using binary search");
        else System.out.println("Not found using binary search");
        end = System.nanoTime();
        long time2 = end - start;
        System.out.println("Binary search took " + time2 / 1000000.0 + " ms\n");

        if(time1 < time2) System.out.println("Linear search is more efficient");
        else System.out.println("Binary search is more efficient");
        target=9998;
        System.out.println("Performing Search operations on dataset of size 100001");
        start = System.nanoTime();
        if(linearSearch(arr2,target)) System.out.println("Target is found using linear search");
        else System.out.println("Target is not present using linear search");
        end = System.nanoTime();
        time1 = end - start;
        System.out.println("Linear search took " + time1 / 1000000.0 + " ms\n");

        Arrays.sort(arr2);
        start = System.nanoTime();
        if(binarySearch(arr2,target)) System.out.println("Target is present using binary search");
        else System.out.println("Not found using binary search");
        end = System.nanoTime();
        time2 = end - start;
        System.out.println("Binary search took " + time2 / 1000000.0 + " ms\n");

        if(time1 < time2) System.out.println("Linear search is more efficient");
        else System.out.println("Binary search is more efficient");

        System.out.println("Performing Search operations on dataset of size 1000001");
        target=99998;
        start = System.nanoTime();
        if(linearSearch(arr3,target)) System.out.println("Target is found using linear search");
        else System.out.println("Target is not present using linear search");
        end = System.nanoTime();
        time1 = end - start;
        System.out.println("Linear search took " + time1 / 1000000.0 + " ms\n");

        Arrays.sort(arr3);
        start = System.nanoTime();
        if(binarySearch(arr3,target)) System.out.println("Target is present using binary search");
        else System.out.println("Not found using binary search");
        end = System.nanoTime();
        time2 = end - start;
        System.out.println("Binary search took " + time2 / 1000000.0 + " ms\n");

        if(time1 < time2) System.out.println("Linear search is more efficient");
        else System.out.println("Binary search is more efficient");
    }
}
