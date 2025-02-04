public class ConcatenateStrings {
    public static void main(String[] args) {
        String[] words = {"Hello", " ", "Sir", "I","am","Java", "Developer."};  

        StringBuffer sb = new StringBuffer();  // Create StringBuffer object

        for (String word : words) {  
            sb.append(word); 
        }

        System.out.println("Concatenated String: " + sb.toString());  
    }
}
