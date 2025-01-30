// Stock Span Problem
// Problem: For each day in a stock price array, calculate the span (number of consecutive days the price was less than or equal to the current day's price).
// Hint: Use a stack to keep track of indices of prices in descending order.


import java.util.Stack;
public class StockSpan {
    public static void main(String[] args) {
        int price[]={100,80,60,70,60,75,85};
        int n=price.length;
        int span[]=new int[n];
        Stack<Integer>st=new Stack<>();
        span[0]=1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.empty() && price[st.peek()]<=price[i]){
                st.pop();
            }

            if(st.empty()){
                span[i]=i+1;          
            }
            else{
            span[i]=i-st.peek();
        }
        st.push(i);

    }
    for(int i=0;i<n;i++){
        System.out.print(span[i]+" ");
    }
    
}
}

