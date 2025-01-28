
/*
 Doubly Linked List: Undo/Redo Functionality for Text Editor
Problem Statement: Design an undo/redo functionality for a text editor using a doubly linked list. Each node represents a state of the text content (e.g., after typing a word or performing a command). Implement the following:
Add a new text state at the end of the list every time the user types or performs an action.
Implement the undo functionality (revert to the previous state).
Implement the redo functionality (revert back to the next state after undo).
Display the current state of the text.
Limit the undo/redo history to a fixed size (e.g., last 10 states).

 */
class TextState {
    String content;
    TextState prev;
    TextState next;

    public TextState(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}

public class UndoRedo {
     TextState currentState;
     int maxHistorySize;
     int currentSize;

    public UndoRedo(int maxHistorySize) {
        this.maxHistorySize = maxHistorySize;
        this.currentSize = 0;
        this.currentState = new TextState(""); // Initial empty state
    }

    public void addState(String content) {
        TextState newState = new TextState(content);
        newState.prev = currentState;
        currentState.next = newState;
        currentState = newState;
        currentSize++;

        // Limit the history size
        if (currentSize > maxHistorySize) {
            TextState temp = currentState;
            while (temp.prev != null) {
                temp = temp.prev;
            }
            temp.next.prev = null;
            temp.next = null;
            currentSize--;
        }
    }

    public void undo() {
        if (currentState.prev != null) {
            currentState = currentState.prev;
        } else {
            System.out.println("No more undo operations available.");
        }
    }

    public void redo() {
        if (currentState.next != null) {
            currentState = currentState.next;
        } else {
            System.out.println("No more redo operations available.");
        }
    }

    public void displayCurrentState() {
        System.out.println("Current State: " + currentState.content);
    }

    public static void main(String[] args) {
        UndoRedo editor = new UndoRedo(10);

        editor.addState("Hello");
        editor.addState("Hello, World");
        editor.addState("Hello, World!");

        editor.displayCurrentState(); // Should display "Hello, World!"

        editor.undo();
        editor.displayCurrentState(); // Should display "Hello, World"

        editor.undo();
        editor.displayCurrentState(); // Should display "Hello"

        editor.redo();
        editor.displayCurrentState(); // Should display "Hello, World"

        editor.redo();
        editor.displayCurrentState(); // Should display "Hello, World!"
    }
}
