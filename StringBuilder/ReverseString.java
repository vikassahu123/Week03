public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";  
        StringBuilder sb = new StringBuilder(str);  // Create StringBuilder object
        sb.reverse();  // Reverse the string

        System.out.println("Reversed String: " + sb.toString()); 
    }
}