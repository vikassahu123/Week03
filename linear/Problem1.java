package linear;




public class Problem1 {
    public static void main(String[] args) {
        int arr[]={2,5,9,-7,8,10,-6};
        int n=arr.length;
        int i;
        for(i=0;i<n;i++){
            if(arr[i]<0) break; 
        }
        if(i<n) System.out.println("first negative element is present at "+ i);
        else System.out.println("negative element is not present ");
    }
    
}
