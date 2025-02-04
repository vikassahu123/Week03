import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "vikassahu";  // Example input

        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();  // To track unique characters

        for (char ch :str.toCharArray()) {  // Iterate through each character
            if (!seen.contains(ch)) {  // If character is not in HashSet
                seen.add(ch);  // Add to HashSet
                sb.append(ch);  // Append to StringBuilder
            }
        }

        System.out.println("String without duplicates: " + sb.toString());
    }
}
