// 1. Singly Linked List: Student Record Management
// Problem Statement: Create a program to manage student records using a singly linked list. Each node will store information about a student, including their Roll Number, Name, Age, and Grade. Implement the following operations:
// Add a new student record at the beginning, end, or at a specific position.
// Delete a student record by Roll Number.
// Search for a student record by Roll Number.
// Display all student records.
// Update a student's grade based on their Roll Number.
// Hint:
// Use a singly linked list where each node contains student information and a pointer to the next node.
// The head of the list will represent the first student, and the last node’s next pointer will be null.
// Update the next pointers when inserting or deleting nodes.

import java.util.Scanner;

class Student               // Node which name is Student.
{     
    // below is all value or data of node.
    String name; 
    int age; 
    int rollNumber; 
    char grade;
    // Node next is replace with Student next. 
     Student next; 


     // initialization of data use constructor. 
     public Student(String name,int age,int rollNumber,char grade) 
     { 
        this.age=age; 
        this.name=name; 
        this.rollNumber=rollNumber; 
        this.grade=grade; 

       next=null; 
     } 

      
     



}
public class StudentRecord 
{  
    private Student head; // Head of the linked list

    // Add a new student record at the beginning
    public void addAtBeginning( String name, int age,int rollNumber, char grade) {
        Student newStudent = new Student(name, age,rollNumber, grade);
        newStudent.next = head;
        head = newStudent;
        System.out.println("Student added at the beginning.");
    }

    // Add a new student record at the end
    public void addAtEnd( String name, int age, int rollNumber,char grade) {
        Student newStudent = new Student( name, age,rollNumber, grade);
        if (head == null) {
            head = newStudent;
        } else {
            Student temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newStudent;
        }
        System.out.println("Student added at the end.");
    }

    // Add a new student record at a specific position
    public void addAtPosition(int position, int rollNumber, String name, int age, char grade) {
        Student newStudent = new Student( name, age, rollNumber,grade);
        if (position == 1) {
            newStudent.next = head;
            head = newStudent;
            System.out.println("Student added at position " + position + ".");
            return;
        }
        Student temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position.");
        } else {
            newStudent.next = temp.next;
            temp.next = newStudent;
            System.out.println("Student added at position " + position + ".");
        }
    }
   

    public static void main(String[] args) { 

        Scanner s=new Scanner(System.in); 
         
         Student s1=new Student("vikas", 21, 100,'A'); 
           
         Student s2=new Student("shivam", 19, 101,'B'); 
           
         Student s3=new Student("rahul", 22, 102,'C'); 
           
         Student s4=new Student("gagan", 19, 103,'A'); 
           
         Student s5=new Student("sumit", 24, 104,'B'); 

         s1.next=s2; 
         s2.next=s3;
         s3.next=s4; 
         s4.next=s5; 
         
         System.out.println("displayng the details of all the student:- ");
         Student temp=s1;
         int i=1;
         while(temp!=null){
             System.out.println("name of the "+i+"st student is "+ temp.name);
             System.out.println("age of the "+i+"st student is "+ temp.age);
             System.out.println("rollno. of the "+i+"st student is "+ temp.rollNumber);
             System.out.println("grade of the "+i+"st student is "+ temp.grade);
             i++;
           temp=temp.next;
           System.out.println();
         }
        

        // if add any student into first position.
        StudentRecord sr=new StudentRecord(); 

        sr.addAtBeginning("ramu",23,105,'B'); //ADD FIRST

        sr.addAtEnd("karan", 32, 107, 'C');   // ADD LAST

        sr.addAtPosition(2, 108, "satyam", 34, 'A');




          System.out.print("enter roll no. to show the details of specific student: ");
         int rollNumber=s.nextInt();
 
         temp=s1;
         int a=0;
         while(temp!=null){
             if(temp.rollNumber == rollNumber){
            System.out.println("name of the student is "+ temp.name);
             System.out.println("age of the student is "+ temp.age);
             System.out.println("grade of the student is "+ temp.grade);
             a=1;
              break;
             }
             temp=temp.next;
         }
         if(a==0){ 
             System.out.println("student with rollno "+ rollNumber +" is not present");
            } 

 
           

    } 

}