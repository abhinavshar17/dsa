package Linkedlist;

public class Addl {

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;

    public void addlast(int data){
        Node n1=new Node(data);
if(head==null){
        head=tail=n1;
        return;

}
        tail.next=n1;
        tail=n1;
    }
    public static void main(String[] args) {
        Addl a1=new Addl();
        a1.addlast(1);
        a1.addlast(2);
    }
}
