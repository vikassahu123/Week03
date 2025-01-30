
// Sliding Window Maximum
// Problem: Given an array and a window size k, find the maximum element in each sliding window of size k.
// Hint: Use a deque (double-ended queue) to maintain indices of useful elements in each window.
import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayList;
public class SlidingWindow {
    public static void main(String args[]){
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int n=arr.length;
        Deque<Integer>dq=new LinkedList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        dq.addFirst(0);

        for(int i=1;i<n;i++){
            
            while(!dq.isEmpty() && arr[dq.getLast()] <= arr[i]) dq.removeLast();
            while(!dq.isEmpty() && i-dq.getFirst() >= k) dq.removeFirst();
            if(dq.isEmpty()){ 
                dq.addFirst(i);
            }
            if(arr[i] < arr[dq.getFirst()]){
                dq.addLast(i);
            }

            if(i-k >= -1){
                ans.add(arr[dq.getFirst()]);
            }



        }

        System.out.println(ans);



    }
    
}

