// Circular Tour Problem
// Problem: Given a set of petrol pumps with petrol and distance to the next pump, determine the starting point for completing a circular tour.
// Hint: Use a queue to simulate the tour, keeping track of surplus petrol at each pump.


public class PetrolPump {
    public static void main(String[] args) {
      int petrol[]={1,2,3,4,5};
      int distance[]={3,4,5,1,2};
      int ansIndex=0;
          int stored=0;
          int n=petrol.length;
          int temp=0;
          for(int i=0;i<n;i++){
              temp+=(petrol[i]-distance[i]);
              if(stored+petrol[i] >= distance[i]){
                  
                  stored=stored+petrol[i]-distance[i];
              }
              else{
                  ansIndex=i+1;
                  stored=0;
  
              }
  
          }
          if(temp<0) System.out.println("there is not any petrol pump that can follow circular path");
          else System.out.println("petrol pump present at index "+ansIndex+" can follow circular path ");
           
    }  
  }
  
