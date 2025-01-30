// Sort a Stack Using Recursion
// Problem: Given a stack, sort its elements in ascending order using recursion.
// Hint: Pop elements recursively, sort the remaining stack, and insert the popped element back at the correct position.


import java.util.Stack;

public class SortStackRecursively {

    // Function to insert an element into the sorted stack at the correct position
    public static void insertInSortedOrder(Stack<Integer> stack, int element) {
        // Base Case: If stack is empty OR top element is smaller than or equal to element
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element); // Insert the element at the correct position
            return;
        }

        // Remove the top element (backtracking step)
        int top = stack.pop();

        // Recursively call the function to insert `element` in sorted order
        insertInSortedOrder(stack, element);

        // Once `element` is inserted, push the `top` element back
        stack.push(top);
    }

    // Recursive function to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {  // Base case: If stack is empty, return

           // Step 1: Remove the top element below.
            int top = stack.pop();// [-3,14,18,-5,30] 
            
                                  //
            sortStack(stack); // Step 2: Recursively sort the remaining stack
             
            // imp when stack is empty  
            insertInSortedOrder(stack, top); // Step 3: Insert the removed element at the correct position
             // top=30, 
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Step 1: Push elements into stack (Unsorted Order)
        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);

        System.out.println("Original Stack: " + stack); // Output: [30, -5, 18, 14, -3]

        // Step 2: Sort the stack
        sortStack(stack);

        System.out.println("Sorted Stack: " + stack); // Output: [-5, -3, 14, 18, 30]
    }
}

