import java.util.*;

public class Problem_3 {
    public static void stringConcatenationTest(int n) {
        String str = "";
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            str += "a";
        }
        long end = System.nanoTime();
        System.out.println("String concatenation took " + (end - start) / 1000000.0 + " ms\n");
    }

    public static void stringBuilderTest(int n) {
        StringBuilder sb = new StringBuilder();
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        long end = System.nanoTime();
        System.out.println("StringBuilder concatenation took " + (end - start) / 1000000.0 + " ms\n");
    }

    public static void stringBufferTest(int n) {
        StringBuffer sb = new StringBuffer();
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        long end = System.nanoTime();
        System.out.println("StringBuffer concatenation took " + (end - start) / 1000000.0 + " ms\n");
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000};

        for (int size : sizes) {
            System.out.println("Performing String concatenation operations for size " + size);
            stringConcatenationTest(size);
            stringBuilderTest(size);
            stringBufferTest(size);
            System.out.println("-----------------------------------------------------------");
        }
    }
}
