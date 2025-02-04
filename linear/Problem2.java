package linear;


public class Problem2 {

    public static void main(String[] args) {
        String arr[]={"vikas ia a 22 years old Boy","He loves learning new skills","He also loves sweets"};
        System.out.println("target word is : "+ "sweets");
        String ans=null;
        for(String it:arr){
           if(it.contains("Problem-Solving")){
            ans=it;
           }
        }

        if(!ans.equals(null)) System.out.println("sentence with target word is : " +ans);
        else System.out.println("sentence is not present");
    }
    
}

