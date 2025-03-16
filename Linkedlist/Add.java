package Linkedlist;

public class Add {
public static class Node{
    int data;
    Node next;

    public Node(int data){
this.data=data;
this.next=null;
    }
}
public static Node head;
public static Node tail;

//method-->
public void addfirst(int data){
        // step1 -->create new node
        Node n1=new Node(data);

        //step2--> n1 node ke next ko head ko point puarana head
         n1.next=head;  //link

        //step3--> head ki value new node mien aa jae
        head=n1;

        //if ll is empty
        Node n2=new Node(data);
        if(head==null){
            head=tail=n2;
            return;
        }
}

    public static void main(String[] args) {
        Add l1=new Add();
        l1.addfirst(1);
        l1.addfirst(2);
    }
}
