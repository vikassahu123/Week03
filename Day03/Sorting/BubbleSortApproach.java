public class BubbleSortApproach {

    public static void bubbleSort(int arr[]) 
    { 
       for( int i=0;i<arr.length-1;i++) 
       { 
          for(int j=0;j<arr.length-1-i ;j++) 
          { 
              if(arr[j]>arr[j+1]) 
              { 
                // swap 
                int temp=arr[j]; 
                arr[j]=arr[j+1]; 
                arr[j+1]=temp; 

              }   
          }  // when one time this loop complete so last ele is the most largest ele. like that - - - > 

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
        
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++) 
        {
            System.out.print(arr[i]+" ");
        }
  

    }
}
