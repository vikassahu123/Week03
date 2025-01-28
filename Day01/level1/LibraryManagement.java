// Doubly Linked List: Library Management System
// Problem Statement: Design a library management system using a doubly linked list. Each node represents a book and contains the following attributes: Book Title, Author, Genre, Book ID, and Availability Status. Implement the following functionalities:
// Add a new book at the beginning, end, or at a specific position.
// Remove a book by Book ID.
// Search for a book by Book Title or Author.
// Update a book’s Availability Status.
// Display all books in forward and reverse order.
// Count the total number of books in the library.
import java.util.*;
class Book{
    String title;
    String author;
    String genre;
    int id;
    boolean availability;
    Book next;
    Book prev;
    public Book(String title,String author,String genre,int id,boolean availability){
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.id=id;
        this.availability=availability;
        next=null;
        prev=null;
    }
}
public class LibraryManagement {
    static void displayInForwardBais(Book head){
        Book temp=head;
        while(temp!=null){
            System.out.println("Book title is: "+temp.title);
            System.out.println("Book author is: "+temp.author);
            System.out.println("Book genre is: "+temp.genre);
            System.out.println("Book id is: "+temp.id);
            System.out.println("Book availability is: "+temp.availability);
            System.out.println();
            temp=temp.next;
        }
    }
    static void displayInReverseBais(Book head){
        Book temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.println("Book title is: "+temp.title);
            System.out.println("Book author is: "+temp.author);
            System.out.println("Book genre is: "+temp.genre);
            System.out.println("Book id is: "+temp.id);
            System.out.println("Book availability is: "+temp.availability);
            System.out.println();
            temp=temp.prev;
        }
    }
    static int countBooks(Book head){
        Book temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    static Book findBookByTitle(Book head,String title){
        Book temp=head;
        while(temp!=null){
            if(temp.title.equals(title)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public static void main(String[] args) {
        Book b1=new Book("The Alchemist", "Paulo Coelho", "Fiction", 101, true);
        Book b2=new Book("The Da Vinci Code", "Dan Brown", "Mystery", 102, true);
        Book b3=new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic", 103, true);
        Book b4=new Book("The Catcher in the Rye", "J.D. Salinger", "Fiction", 104, true);
        Book b5=new Book("To Kill a Mockingbird", "Harper Lee", "Classic", 105, true);
        Book b6=new Book("1984", "George Orwell", "Dystopian", 106, true);
        Book b7=new Book("Pride and Prejudice", "Jane Austen", "Classic", 107, true);
        b1.next=b2;
        b2.next=b3; b3.next=b4; b4.next=b5;b5.next=b6; b6.next=b7;
        b7.prev=b6; b6.prev=b5; b5.prev=b4; b4.prev=b3; b3.prev=b2; b2.prev=b1;
        System.out.println("displayng the details of all the books in forward direction:- ");
        displayInForwardBais(b1);
        System.out.println("displayng the details of all the books in reverse direction:- ");
        displayInReverseBais(b1);
        System.out.println("Total number of books in the library are: "+countBooks(b1));
        System.out.println("enter the title of the book to be searched: ");
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        Book temp=findBookByTitle(b1,title);
        if(temp!=null){
            System.out.println("Book title is: "+temp.title);
            System.out.println("Book author is: "+temp.author);
            System.out.println("Book genre is: "+temp.genre);
            System.out.println("Book id is: "+temp.id);
            System.out.println("Book availability is: "+temp.availability);
        }
        else{
            System.out.println("Book with title "+title+" is not present");
        }
        

       
    }
    
}