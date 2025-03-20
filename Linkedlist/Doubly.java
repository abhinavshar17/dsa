package Linkedlist;

public class Doubly {
    public class  Node {
    int data;
    Node next;
    Node prev;


    public Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
        
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add:
    public void addf(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    //print:
    public void print(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"-");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Doubly dl=new Doubly();
        dl.addf(3);
        dl.addf(1);
        dl.addf(2);
        dl.print();
    }
}
