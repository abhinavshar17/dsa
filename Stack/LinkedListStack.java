package Stack;

class LinkedListStack {
    private Node top; 

    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    

    public int peek() {
        if (isEmpty()) {
            System.out.println("empty");
        }
        return top.data;
    }

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

