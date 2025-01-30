// Implement a Queue Using Stacks
// Problem: Design a queue using two stacks such that enqueue and dequeue operations are performed efficiently.
// Hint: Use one stack for enqueue and another stack for dequeue. Transfer elements between stacks as needed.


import java.util.Stack;

class QueueUsingStacks {
    Stack<Integer> enqueueStack = new Stack<>(); // Stack for enqueue
    Stack<Integer> dequeueStack = new Stack<>(); // Stack for dequeue

    // Enqueue operation
    public void enqueue(int x) {        // imp for adding ele in queue using stack. 
        enqueueStack.push(x);
    }

    // Dequeue operation
    public int dequeue() {                 // imp for remove ele in queue using stack. 
        if (dequeueStack.isEmpty()) {
            if (enqueueStack.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            // Transfer all elements from enqueueStack to dequeueStack
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.pop(); // Remove from front
    }

    // Peek operation (Get front element)
    public int peek() {
        if (dequeueStack.isEmpty()) {
            if (enqueueStack.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        System.out.println("Dequeued: " + queue.dequeue()); // 10
        System.out.println("Front: " + queue.peek()); // 20
        
        queue.enqueue(40);
        System.out.println("Dequeued: " + queue.dequeue()); // 20
        System.out.println("Dequeued: " + queue.dequeue()); // 30
        System.out.println("Dequeued: " + queue.dequeue()); // 40

        System.out.println("Is queue empty? " + queue.isEmpty()); // true
    }
}
