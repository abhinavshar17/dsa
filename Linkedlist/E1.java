// REMOVE or FIX the package statement if necessary
 package Linkedlist; 

public class E1 {
   
    public static void display(Node head) {
        if (head == null) return;
        System.out.print(head.data + "->");
        display(head.next);
    }
public static  void displayr(Node head){
if(head==null) return;
displayr(head.next);
System.out.print(head.data+"->");

}
public static void normaldis(Node head){
    Node temp=head;

    while(temp!=null){
System.out.print(temp.data+"->");
temp=temp.next;

    }
}

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;

        display(a);
        System.out.println();
        
        displayr(a);
        System.out.println();
        normaldis(a);
        System.out.println("NULL"); // Optional: To indicate end of the list
    }
}
