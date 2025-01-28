
/*Singly Linked List: Social Media Friend Connections
Problem Statement: Create a system to manage social media friend connections using a singly linked list. Each node represents a user with User ID, Name, Age, and List of Friend IDs. Implement the following operations:
Add a friend connection between two users.
Remove a friend connection.
Find mutual friends between two users.
Display all friends of a specific user.
Search for a user by Name or User ID.
Count the number of friends for each user.

 */


 import java.util.ArrayList;

 class User {
     String name;
     int id;
     int age;
     ArrayList<String> friends;
     User next;
 
     public User(String name, int id, int age, ArrayList<String> friends) {
         this.name = name;
         this.id = id;
         this.age = age;
         this.friends = friends;
         this.next = null;
     }
 }
 
 public class SocialMedia {
     static void findMutualFriends(User u1, User u2) {
         ArrayList<String> mutualFriends = new ArrayList<>();
         for (String friend : u1.friends) {
             if (u2.friends.contains(friend)) {
                 mutualFriends.add(friend);
             }
         }
         System.out.println("Mutual friends between " + u1.name + " and " + u2.name + " are: ");
         for (String friend : mutualFriends) {
             System.out.println(friend);
         }
     }
      static void addingFriendConnection(User u1, User u2) {
         if(!u1.friends.contains(u2.name)){
             u1.friends.add(u2.name);
         }
         if(!u2.friends.contains(u1.name)){
             u2.friends.add(u1.name);
         }
         else {
             System.out.println("Friend connection already exists");
         }
      }
      static void removeFriendConnection(User u1, User u2) {
         if(u1.friends.contains(u2.name)){
             u1.friends.remove(u2.name);
         }
         if(u2.friends.contains(u1.name)){
             u2.friends.remove(u1.name);
         }
         else {
             System.out.println("Friend connection does not exist");
         }
      }
 
     
 
     static void displayAllFriends(User u1) {
         System.out.println("Friends of " + u1.name + " are: ");
         for (String friend : u1.friends) {
             System.out.println(friend);
         }
     }
 
     static User searchUserByName(User head, String name) {
         User temp = head;
         while (temp != null) {
             if (temp.name.equals(name)) {
                 return temp;
             }
             temp = temp.next;
         }
         return null;
     }
 
 
     static int countFriends(User u1) {
         return u1.friends.size();
     }
 
     public static void main(String[] args) {
         ArrayList<String> friends = new ArrayList<>();
         friends.add("rahul");
         friends.add("Nishank");
         friends.add("amit");
         friends.add("tikesh");
         User u1 = new User("Abhay", 101, 20, friends);
 
         ArrayList<String> friends2 = new ArrayList<>(friends);
         friends2.remove("rahul");
         User u2 = new User("Vishnu", 102, 21, friends2);
         ArrayList<String> friends3 = new ArrayList<>();
         friends3.add("keshav");
         friends3.add("amit");
         friends3.add("rahul");
         friends3.add("bhuvan");
         User u3 = new User("Amol", 103, 22, friends3);
         ArrayList<String> friends4 = new ArrayList<>();
         friends4.add("bharat");
         friends4.add("keshav");
         User u4 = new User("Bhuvan", 104, 23, friends4);
 
         u1.next = u2;
         u2.next = u3;
         u3.next = u4;
 
         System.out.println("Finding mutual friends between two users (u1 and u3)");
         findMutualFriends(u1, u3);
 
         System.out.println("Displaying all friends of u1");
         displayAllFriends(u1);
         System.out.println("Adding friend connection between u1 and u2");
         addingFriendConnection(u1, u2);
         System.out.println("connection is made successfully");
     System.out.println("Removing friend connection between u1 and u2");
         removeFriendConnection(u1, u2);
         System.out.println("connection is removed successfully");
 
 
         System.out.println("Searching for user by name 'Vishnu'");
         User foundUser = searchUserByName(u1, "Vishnu");
         if (foundUser != null) {
             System.out.println("User found: " + foundUser.name);
         } else {
             System.out.println("User not found");
         }
 
         System.out.println("Counting the number of friends for u1");
         int friendCount = countFriends(u1);
         System.out.println("Number of friends for " + u1.name + ": " + friendCount);
     }
 }
 