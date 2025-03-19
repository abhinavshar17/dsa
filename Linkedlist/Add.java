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
public static int size;

//method-->
public void addfirst(int data){
        // step1 -->create new node
        Node n1=new Node(data);
        size++;
        if(head==null){
            head=tail=n1;
            return;
        }
        //step2--> n1 node ke next ko head ko point puarana head
         n1.next=head;  //link
   

        //step3--> head ki value new node mien aa jae
        head=n1;

        //if ll is empty
        
       
}

//add to last ke lae:
public void addlast(int data){
    Node n2=new Node(data);
    size++;
    if(head==null){
        head=tail=n2;
        return;
    }
    tail.next=n2;
    tail=n2;
}

// add in any index
public void addmid(int index,int data){
    Node newNode=new Node(data);
    Node temp=head;
    int i=0;
    while(i<index-1){
        temp=temp.next;
        i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;
}

//remove from first:
public int removef(){
    if(size==0){ // size is zero 
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
    }
    else if(size==1){// head and tail at same place 
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
    }
    int val=head.data;
    head=head.next;
    size--;
    return val;
}

// remove from the last 
public int removelast(){
    if(size==0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
    }
    else if(size==1){
        int val=head.data;
        head=tail=null;
        return val;
    }
    // prev :i=size-2;
    Node prev=head; 
    for(int i=0;i<size-2;i++){
prev=prev.next;
    }
    int val=tail.data;
    prev.next=null;
    tail=prev.next;
    return val;
}
//printing:
public void Print(){
    if(head==null){
        System.out.println("ll is empty");
        return;
    }
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data +"->");
        temp=temp.next;
    }
    System.out.println("null");
}



    public static void main(String[] args) {
        Add l1=new Add();
        l1.Print();
        l1.addfirst(2);
        l1.Print();
        l1.addfirst(1);
        l1.Print();
        l1.addlast(3);
        l1.Print();
        l1.addlast(4);
        l1.Print();
        l1.addmid(1,9);
        l1.Print();
        System.out.println(l1.size);

        l1.removef();
        l1.Print();
        l1.removelast();
        l1.Print();
    }
}
