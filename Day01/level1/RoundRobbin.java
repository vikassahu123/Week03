// 6. Circular Linked List: Round Robin Scheduling Algorithm
// Problem Statement: Implement a round-robin CPU scheduling algorithm using a circular linked list. Each node will represent a process and contain Process ID, Burst Time, and Priority. Implement the following functionalities:
// Add a new process at the end of the circular list.
// Remove a process by Process ID after its execution.
// Simulate the scheduling of processes in a round-robin manner with a fixed time quantum.
// Display the list of processes in the circular queue after each round.
// Calculate and display the average waiting time and turn-around time for all processes.
import java.util.Scanner;
class Process{
    int id;
    int burstTime;
    int priority;
    Process next;
    public Process(int id,int burstTime,int priority){
        this.id=id;
        this.burstTime=burstTime;
        this.priority=priority;
        this.next=this;
    }
}
public class RoundRobbin {
    static void display(Process head){
        Process temp=head;
        while(temp.next!=head){
            System.out.println("process id is: "+temp.id);
            System.out.println("process burst time is: "+temp.burstTime);
            System.out.println("process priority is: "+temp.priority);
            System.out.println();
            temp=temp.next;
        }
        System.out.println("process id is: "+temp.id);
        System.out.println("process burst time is: "+temp.burstTime);
        System.out.println("process priority is: "+temp.priority);
        System.out.println();
    }
    static void addAtEnd(Process head,Process newProcess){
        Process temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newProcess;
        newProcess.next=head;
    }
    static Process removeById(Process head,int id){
        Process temp=head;
        Process prev=null;
        while(temp.next!=head){
            if(temp.id==id){
                prev.next=temp.next;
                return temp;
            }
            prev=temp;
            temp=temp.next;
        }
        return null;
    }
    public static void main(String[] args) {
        Process p1=new Process(101,5,1);
        Process p2=new Process(102,3,2);
        Process p3=new Process(103,8,3);
        Process p4=new Process(104,6,4);
        p1.next=p2; p2.next=p3; p3.next=p4;
        p4.next=p1;
        Process head=p1;
        System.out.println("displaying all processes");
        display(head);
        System.out.println();
        System.out.println("adding a new process at the end");

        Process p5=new Process(105,4,5);
        addAtEnd(head,p5);
        System.out.println("process "+p5.id+" is added successfully at the end");
        System.out.println("enter procress id to be removed");
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
          if(removeById(head,id)!=null){
              System.out.println("process is removed successfully");
          }
          else{
              System.out.println("process is not found");
          }

    }
    
}