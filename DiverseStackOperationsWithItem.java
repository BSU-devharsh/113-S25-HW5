// Write your Name here

// Part 5 - Stack Data Structure
// (Tip: To identify and fix the errors, go to Pull requests >> Feedback >> Checks >> Autograding test results)


import java.util.Stack;
import java.util.EmptyStackException;

public class DiverseStackOperationsWithItem {

    public static void main(String[] args) {
        // Create Stacks
        Stack<String> stringStack = new Stack<>();
        
      

        // Push Operations
        stringStack.push("Hello");
        
      

        // Peek and Pop Operations
        System.out.println("String Stack Operations:");
        performStackOperations(stringStack);

        
      

        // Empty Check
        System.out.println("\nEmpty Stack Check:");
        System.out.println("String Stack Empty: " + stringStack.isEmpty());

      
    }

    public static <T> void performStackOperations(Stack<T> stack) {
        while (!stack.isEmpty()) {
            try {
                System.out.println("Peek: " + stack.peek());
                System.out.println("Pop: " + stack.pop());
            } catch (EmptyStackException e) {
                System.out.println("Stack is empty.");
            }
        }
    }
}
