// Singly Linked List: Inventory Management System
// Problem Statement: Design an inventory management system using a singly linked list where each node stores information about an item such as Item Name, Item ID, Quantity, and Price. Implement the following functionalities:
// Add an item at the beginning, end, or at a specific position.
// Remove an item based on Item ID.
// Update the quantity of an item by Item ID.
// Search for an item based on Item ID or Item Name.
// Calculate and display the total value of inventory (Sum of Price * Quantity for each item).
// Sort the inventory based on Item Name or Price in ascending or descending order.
// Hint:
// Use a singly linked list where each node represents an item in the inventory.
// Implement sorting using an appropriate algorithm (e.g., merge sort) on the linked list.
// For total value calculation, traverse through the list and sum up Quantity * Price for each item.

import java.util.Scanner;
class Item{
    String name;
    int id;
    int quantity;
    int price;
    Item next;
    public Item(String name,int id,int quantity,int price){
        this.name=name;
        this.id=id;
        this.quantity=quantity;
        this.price=price;
        this.next=null;
    }
}

public class Inventory {
    static void display(Item head){
        Item temp=head;
        while(temp!=null){
            System.out.println("item name is: "+temp.name);
            System.out.println("item id is: "+temp.id);
            System.out.println("item quantity is: "+temp.quantity);
            System.out.println("item price is: "+temp.price);
            System.out.println();
            temp=temp.next;
        }
    }
    static void addAtEnd(Item head,Item newItem){
        Item temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newItem;
    }
    static Item searchById(Item head,int id){
        Item temp=head;
        while(temp!=null){
            if(temp.id==id){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    static int calculatetotalPrice(Item head){
        Item temp=head;
        int total=0;
        while(temp!=null){
            total+=temp.price*temp.quantity;
            temp=temp.next;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        Item i1=new Item("pen",101,10,7);
        Item i2=new Item("pencil",102,10,5);
        Item i3=new Item("book",103,10,50);
        Item i4=new Item("bag",104,10,100);
        i1.next=i2; i2.next=i3; i3.next=i4;
        System.out.println("displaying all items");
        display(i1);
        Item i5=new Item("eraser",105,10,3);
        System.out.println("item name : "+i5.name +" id: "+i5.id+"  quantity  "+i5.quantity+"   price  "+i5.price);
        addAtEnd(i1,i5);
        System.out.println("above item is added successfully at the end: ");
        System.out.println();
        System.out.println("enter the item id to be searched: ");
        int id=sc.nextInt();
        if(searchById(i1,id)!=null){
            Item item=searchById(i1,id);
            System.out.println("item name is: "+item.name);
            System.out.println("item id is: "+item.id);
            System.out.println("item quantity is: "+item.quantity);
            System.out.println("item price is: "+item.price);
        }
        else{
            System.out.println("item is not found");
        }
        System.out.println("total price of inventory is: "+calculatetotalPrice(i1));

        

    }
    
}
