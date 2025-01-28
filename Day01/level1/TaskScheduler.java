/*Circular Linked List: Task Scheduler
Problem Statement: Create a task scheduler using a circular linked list. Each node in the list represents a task with Task ID, Task Name, 
//Priority, and Due Date. Implement the following functionalities:
Add a task at the beginning, end, or at a specific position in the circular list.
Remove a task by Task ID.
View the current task and move to the next task in the circular list.
Display all tasks in the list starting from the head node.
Search for a task by Priority.
Hint:
Use a circular linked list where the last node’s next pointer points back to the first node, creating a circular structure.
Ensure that the list loops when traversed from the head node, so tasks can be revisited in a circular manner.
When deleting or adding tasks, maintain the circular nature by updating the appropriate next pointers.
 */

 import java.util.Scanner;

 class Task{
     String name;
     int id;
     String dueDate;
     int priority;
     Task next;
     public Task(String name,int id,String dueDate,int priority){
      this.name=name;
      this.id=id;
      this.dueDate=dueDate;
      this.priority=priority;
      this.next=null;
     }
 
 }
 public class TaskScheduler {
 
     static void display(Task head){
         Task temp=head;
         while(temp.next!=head){
             System.out.println("task name is: "+temp.name);
             System.out.println("task id is: "+temp.id);
             System.out.println("task due date is: "+temp.dueDate);
             System.out.println("task priority is: "+temp.priority);
             System.out.println();
             temp=temp.next;
         }
     }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         Task t1=new Task("reading",101,"28/01/25",1);
         Task t2=new Task("writing",102,"28/01/25",2);
         Task t3=new Task("playing",103,"28/01/25",3);
         Task t4=new Task("singing",104,"28/01/25",4);
         t1.next=t2; t2.next=t3; t3.next=t4;
         t4.next=t1;
         Task head=t1;
         System.out.println("displaying all tasks");
         display(head);
         System.out.print("enter the task id to be searched:  ");
         int id=sc.nextInt();
         Task temp=head;
         int flag=0;
         while(temp.next!=head){
             if(temp.id==id){
                 System.out.println("task name is: "+temp.name);
                 System.out.println("task id is: "+temp.id);
                 System.out.println("task due date is: "+temp.dueDate);
                 System.out.println("task priority is: "+temp.priority);
                 flag=1;
                 break;
             }
             temp=temp.next;
         }
         if(flag==0){
             System.out.println("task is not found");
         }
         System.out.println();
         System.out.println("wants to add a task at the end  (yes/no)");
         String choice=sc.next();
         if(choice.equals(choice)){
         System.out.println("adding a task at the end");
         Task t5=new Task("dancing",105,"28/01/25",5);
         t4.next=t5;
         t5.next=head;
          System.out.println();
          System.out.println("task name is: "+t5.name);
             System.out.println("task id is: "+t5.id);
             System.out.println("task due date is: "+t5.dueDate);
             System.out.println("task priority is: "+t5.priority);
             System.out.println();
             System.out.println("above task is added successfully");
         }
 
 
 
     }
     
 }