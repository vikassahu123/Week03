public class Problem_5 {
    public static int iterative (int n){
        int a=0,b=1;
        for (int i = 1; i < n; i++) {
            int sum=a+b;
            a=b;
            b=sum;
        }
        return b;
    }
    public static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1)+fibo(n-2);

    }
    public static void main(String[] args) {
        int a=10,b=30,c=50;
        long start=System.nanoTime();
        System.out.println(a+" fibonacci number is(iterative) "+iterative(a));
        long end=System.nanoTime();
        double time1 = (end-start)/1000000.0;
        System.out.println("time taken to find 10th fibonacci number by iterative "+ time1);

        start=System.nanoTime();
        System.out.println(a+" fibonacci number is(recursive) "+fibo(a));
        end=System.nanoTime();
        double time2=(end-start)/1000000.0;
        System.out.println("time taken to find 10th fibonacci number by recursive "+ time2);

        System.out.println("-----------------------------------------------------");
        start=System.nanoTime();
        System.out.println(b+" fibonacci number is(iterative) "+iterative(b));
        end=System.nanoTime();
        time2=(end-start)/1000000.0;
        System.out.println("time taken to find 30th fibonacci number by iterative "+ time2);

        start=System.nanoTime();
        System.out.println(b+" fibonacci number is(recursive) "+fibo(c));
        end=System.nanoTime();
        time2=(end-start)/1000000.0;
        System.out.println("time taken to find 30th fibonacci number by recursive "+ time2);

        System.out.println("-----------------------------------------------------");
        start=System.nanoTime();
        System.out.println(c+" fibonacci number is(iterative) "+iterative(c));
        end=System.nanoTime();
        time2=(end-start)/1000000.0;
        System.out.println("time taken to find 50th fibonacci number by iterative "+ time2);

        start=System.nanoTime();
        System.out.println(b+" fibonacci number is(recursive) "+fibo(c));
        end=System.nanoTime();
        time2=(end-start)/1000000.0;
        System.out.println("time taken to find 30th fibonacci number by recursive "+ time2);

    }
}
