
public class StringBufferVsStringBuilde {
    public static void main(String[] args) {
        int n = 100000; 
        String text = "Satya";

       
        long startTime = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            buffer.append(text);
        }
        long endTime = System.nanoTime();
        long bufferTime = endTime - startTime;

        
        startTime = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(text);
        }
        endTime = System.nanoTime();
        long builderTime = endTime - startTime;

   
        System.out.println("Time taken by StringBuffer: " + bufferTime / 100000 + " ms");
        System.out.println("Time taken by StringBuilder: " + builderTime / 100000 + " ms");
    }
}
