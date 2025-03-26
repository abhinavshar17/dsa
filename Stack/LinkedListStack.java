package Stack;

// Stack implementation using Linked List
class LinkedListStack {
    private Node top; // Top of the stack

    // Node class for linked list
    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Push method to add element to stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop method to remove and return top element
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    // Peek method to return top element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display stack elements
    public void display() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // 30 -> 20 -> 10 -> NULL
        System.out.println("Top: " + stack.peek()); // 30
        System.out.println("Popped: " + stack.pop()); // 30
        stack.display(); // 20 -> 10 -> NULL
    }
}

