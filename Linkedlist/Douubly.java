package Linkedlist;
public class Douubly {
    public  static class  Node {
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
    }
       public static void display(Node head) {
Node temp=head;
while(temp!=null){
    System.out.print(temp.data+" ->");
    temp=temp.next;
}

       }
       public static void displayrev(Node tail) {
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.prev;
        }
        
               }
               public static void displayrandom(Node random) {
                Node temp=random;
                while(temp.prev!=null){// head node
                    
                    temp=temp.prev;
                }
                while(temp!=null){
                    System.out.print(temp.data+" ->");
                    temp=temp.next;
                }
                
                       }
    
    public static void main(String[] args) {
        //4 10 2 99 13
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
   display(a);
    System.out.println();
    displayrandom(c);
    }

}
}