
/*
 * Circular Linked List: Online Ticket Reservation System
Problem Statement: Design an online ticket reservation system using a circular linked list, where each node represents a booked ticket. Each node will store the following information: Ticket ID, Customer Name, Movie Name, Seat Number, and Booking Time. Implement the following functionalities:
Add a new ticket reservation at the end of the circular list.
Remove a ticket by Ticket ID.
Display the current tickets in the list.
Search for a ticket by Customer Name or Movie Name.
Calculate the total number of booked tickets.

 */
class Ticket{
    int ticketId;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    Ticket next;
    public Ticket(int ticketId,String customerName,String movieName,int seatNumber,String bookingTime){
        this.ticketId=ticketId;
        this.customerName=customerName;
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.bookingTime=bookingTime;
        this.next=this;
    }
}
public class MovieTicket {
    static void display(Ticket head){
        Ticket temp=head;
        while(temp.next!=head){
            System.out.println("Ticket id is: "+temp.ticketId);
            System.out.println("Customer name is: "+temp.customerName);
            System.out.println("Movie name is: "+temp.movieName);
            System.out.println("Seat number is: "+temp.seatNumber);
            System.out.println("Booking time is: "+temp.bookingTime);
            System.out.println();
            temp=temp.next;
        }
        System.out.println("Ticket id is: "+temp.ticketId);
        System.out.println("Customer name is: "+temp.customerName);
        System.out.println("Movie name is: "+temp.movieName);
        System.out.println("Seat number is: "+temp.seatNumber);
        System.out.println("Booking time is: "+temp.bookingTime);
        System.out.println();
    }
    static void addAtEnd(Ticket head,Ticket newTicket){
        Ticket temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newTicket;
        newTicket.next=head;
    }
    static Ticket removeById(Ticket head,int ticketId){
        Ticket temp=head;
        Ticket prev=null;
        while(temp.next!=head){
            if(temp.ticketId==ticketId){
                prev.next=temp.next;
                return temp;
            }
            prev=temp;
            temp=temp.next;
        }
        return null;
    }
    static Ticket searchByCustomerName(Ticket head,String customerName){
        Ticket temp=head;
        while(temp.next!=head){
            if(temp.customerName.equals(customerName)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    
    static int countTickets(Ticket head){
        Ticket temp=head;
        int count=0;
        while(temp.next!=head){
            count++;
            temp=temp.next;
        }
        return count+1;
    }
    public static void main(String[] args) {
        Ticket t1=new Ticket(101,"Abhay","Avengers",1,"10:00 AM");
        Ticket t2=new Ticket(102,"Nishank","Iron Man",2,"11:00 AM");
        Ticket t3=new Ticket(103,"Keshav","Thor",3,"12:00 PM");
        Ticket t4=new Ticket(104,"Bharat","Hulk",4,"01:00 PM");
        t1.next=t2; t2.next=t3; t3.next=t4;
        t4.next=t1;
        Ticket head=t1;
        System.out.println("displaying all tickets");
        display(head);
        System.out.println();
        System.out.println("adding a new ticket at the end");
        Ticket t5=new Ticket(105,"Guru","Black Widow",5,"02:00 PM");
        addAtEnd(head,t5);
        System.out.println("above ticket is added successfully at the end: ");

        System.out.println();
        System.out.println("removing a ticket by ticket id");
        Ticket removedTicket=removeById(head,102);
        System.out.println("ticket with ticket id 102 is removed successfully");
        System.out.println();
        System.out.println("searching a ticket by customer name");
        Ticket searchedTicket=searchByCustomerName(head,"Keshav");
        System.out.println("Ticket id is: "+searchedTicket.ticketId);
        System.out.println("Customer name is: "+searchedTicket.customerName);
        System.out.println("Movie name is: "+searchedTicket.movieName);
        System.out.println("Seat number is: "+searchedTicket.seatNumber);
        System.out.println("Booking time is: "+searchedTicket.bookingTime);
        System.out.println();
        System.out.println("total number of tickets booked are: "+countTickets(head));
        
        
    }
    
}

