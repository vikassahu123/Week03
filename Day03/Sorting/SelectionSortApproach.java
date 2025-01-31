public class SelectionSortApproach {

    public static void SelectionSort(int arr[]) 
    { 
        for( int i=0;i<arr.length;i++) 
       { 
         int smallest=i;

          for(int j=i+1 ; j<arr.length ;j++) 
          { 
              if(arr[smallest]>arr[j]) 
              {  
                smallest=j;
               
              }   
          } 
           // swap 
           int temp=arr[smallest]; 
           arr[smallest]=arr[i]; 
           arr[i]=temp; 

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
        
        SelectionSort(arr);
        for(int i=0;i<arr.length;i++) 
        {
            System.out.print(arr[i]+" ");
        }
    }
}
