public class QuickSortApproach {



    public static int partition(int arr[], int low, int high) 
    { 
        int pivot=arr[high];           // I assume last element is the pivot ele.

        int i=low-1; //  tracking place for small ele. and at the last update for pivot ele.

        for(int j=low;j<high;j++)  
        { 
            if(arr[j]<pivot) 
            { 
                i++; 

                // swap 

                int temp=arr[j]; 
                arr[j]=arr[i]; 
                arr[i]=temp; 
            }
        } 
        i++; 
        int temp=arr[i]; 
        arr[i]=pivot; 
        arr[high]=temp;
        return i;    // pivot present at arr[i] and we return i that is index of pivot.

    }
     public static void quickSort(int arr[], int low, int high )
     {     
        if(low<high) 
        {
             int pivotIndex=partition(arr,low,high); 
    
             quickSort(arr, low, pivotIndex-1);
             quickSort(arr, pivotIndex+1, high); 
             
        }

     }
    public static void main(String[] args) {
         int arr[]={2,6,5,4,7,8,1,9}; 

         int n=arr.length; 

         System.out.println("Before sorting array look like this ");
         for(int i=0;i<arr.length;i++) 
         {
             System.out.print(arr[i]+" ");
         }
   
         
         System.out.println(); 
         System.out.println("After Marge sorting array look like this "); 
  
         quickSort(arr, 0, n-1); // imp n-1 is a last elemnt index.
         for(int i=0;i<arr.length;i++) 
         {
             System.out.print(arr[i]+" ");
         }
    }
}
