package FileReader;




import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem2 {
    public static void main(String[] args) {
        try{
            String path = "D:\\Week03\\Day04\\fileReaderProblems\\extra.txt";
            FileReader fr=new FileReader(path);
            BufferedReader br=new BufferedReader(fr);
            String s;
            System.out.println("target is :-  vikas \n");
           System.out.println("given text in the file is :- \n");
            int count=0;
            while((s=br.readLine()) !=null){
                System.out.println(s);
             String arr[]=s.split(" ");
              for(String it:arr){
                if(it.equals("vikas")) count++;
              }

            }
            br.close();
            System.out.println();
            System.out.println("target comes "+count+" times");
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        
    }
    
}

