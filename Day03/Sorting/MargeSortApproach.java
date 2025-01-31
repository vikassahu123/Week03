public class MargeSortApproach 
{     
    public static void conquer(int arr[], int si,int mid,int ei) 
    { 
        int merged[]=new int[ei-si+1]; // new arr for adding all conquer ele into this arr 
                                       // and after this is array ele paste into the original array.

         int index1=si;   // for first divide part of array.
         int index2=mid+1;   // for second divide part of array.
         int x=0;            // for original array index where we paste ele.

          while( index1<=mid && index2<=ei)    // basically when both array are traverse by this statement. 
          { 
               if(arr[index1]<arr[index2]) 
               { 
                merged[x]=arr[index1]; 
                x++;                             // index update 
                index1++;                         // index update 


               } 
               else 
               { 
                 merged[x]=arr[index2]; 
                 x++; 
                 index2++;
               }

          } 

          while (index1<=mid) //   if second part is end but in the first part one or many ele are remaining so place in merge array. 
          { 
            merged[x]=arr[index1];
            x++; 
            index1++; 
          } 

          while (index2<=ei) //   if first part is end but in the second part one or many ele are remaining so place in merge array. 
          { 
            merged[x]=arr[index2];
             x++; 
             index2++;
          }

          // now paste all merge[] ele into the original array --> arr. 
          for(int i=0, j=si;i<merged.length;i++,j++) 
          { 
             arr[j]=merged[i]; 
          }
    }


    public static void divide(int arr[], int si,int ei) 
    { 
         if(si>=ei) // if we have only one ele or the arrat elements are divide till one element.
         { 
            return; 
         } 
           // when size is more than one we divide it many times.
            int mid=si+(ei-si)/2; 
            divide(arr,si, mid); 
            divide(arr, mid+1, ei);
         

            // when divide is complete we perform conquer to add and arrange all element into sort manner. 

            conquer(arr,si,mid,ei);

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
 
        divide(arr, 0, n-1); // imp n-1 is a last elemnt index.
        for(int i=0;i<arr.length;i++) 
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}