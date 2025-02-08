


import java.io.*;

public class Problem_4 {
    static void efficiencyTest(String filePath) {
        long startTime, endTime;
        double netTime;

        // FileReader with BufferedReader
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            startTime = System.nanoTime();

            char[] buffer = new char[8192]; // Read in chunks (efficient for large files)
            while (bufferedReader.read(buffer) != -1) {
                // File is read, but not printed
            }

            endTime = System.nanoTime();
            netTime = (endTime - startTime) / 1_000_000.0;
            System.out.println("FileReader Time: " + netTime + " ms.");


        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found. Please check the file path.");
        } catch (IOException e) {
            System.err.println("Error reading the file.");
        }

        // InputStreamReader with BufferedReader
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            startTime = System.nanoTime();

            char[] buffer = new char[8192]; // Read in chunks
            while (bufferedReader.read(buffer) != -1) {
                // File is read, but not printed
            }

            endTime = System.nanoTime();
            netTime = (endTime - startTime) / 1_000_000.0;
            System.out.println("InputStreamReader Time: " + netTime + " ms.");


        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found. Please check the file path.");
        } catch (IOException e) {
            System.err.println("Error reading the file.");
        }
    }

    public static void main(String[] args) {
        String filePath1 = "C:\\week03\\Day0_5\\src\\AllTextFiles\\large_file_1MB.txt";
        String filePath2 = "C:\\week03\\Day0_5\\src\\AllTextFiles\\large_file_100MB.txt";
        String filePath3 = "C:\\week03\\Day0_5\\src\\AllTextFiles\\large_file_150MB.txt";

        System.out.println("\n\tReading 1MB File");
        efficiencyTest(filePath1);

        System.out.println("\n\tReading 100MB File");
        efficiencyTest(filePath2);

        System.out.println("\n\tReading 150MB File");
        efficiencyTest(filePath3);
    }
}
