package Linkedlist;

public class E2 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class ll {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = tail = temp; // ✅ Fixed assignment
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void insertatfirst(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }
        void atindex(int index,int data){
            
            Node t=new Node(data);
            Node temp = head;
            for(int i=1;i<=index-1;i++){
                    temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        Node lastn(Node head,int n){
            Node slow=head;
            Node fast=head;
            for(int i=1;i<n;i++){
                fast=fast.next;
            }
            while(fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
        public  void deletefromnth(Node head,int n){
            Node slow=head;
            Node fast=head;
            for(int i=1;i<=n;i++){
                fast=fast.next;
            }
            while(fast.next!=null){
               slow=slow.next;
               fast=fast.next; 
            }
            slow.next=slow.next.next;
        }

        void display() { // ✅ Added display method
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
        ll myList = new ll(); // ✅ Fixed object creation

        myList.insertAtEnd(4);
        myList.insertAtEnd(5);
        myList.insertAtEnd(7);
        myList.insertAtEnd(8);
        myList.display(); // 

        myList.insertatfirst(3);
        myList.display(); 
        myList.atindex(1, 99);
        myList.display();
        Node result = myList.lastn(myList.head, 2);
        System.out.println("2nd last node is: " + result.data);
        myList.deletefromnth(myList.head, 2);
        myList.display();
    }
}
