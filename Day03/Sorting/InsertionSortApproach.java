public class InsertionSortApproach {

    public static void InsertionSort(int arr[]) 
    { 
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

    }
   public static void main(String[] args) {
    
    int arr[]={3,5,2,7,9,8};  
    int n=arr.length; 

    System.out.println("Before sorting array look like this ");
    for(int i=0;i<arr.length;i++) 
    {
        System.out.print(arr[i]+" ");
    }

    
    System.out.println(); 
    System.out.println("After Marge sorting array look like this "); 
    
    InsertionSort(arr);
    for(int i=0;i<arr.length;i++) 
    {
        System.out.print(arr[i]+" ");
    }
  }
}
