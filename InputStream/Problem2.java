package InputStream;

import java.io.*;

public class Problem2 {
    public static void main(String[] args) {
        try {
            String path = "\\week03\\Day04\\level1\\InputStream\\empty.txt";
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            
            System.out.println("Enter text (type 'exit' to stop):");
            String line;
            
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                bw.write(line);
                bw.newLine();
            }
            
            br.close();
            bw.close();
            System.out.println("Input saved to file: " + path);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
