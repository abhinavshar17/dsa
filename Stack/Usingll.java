package Stack;

public class Usingll {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class llstack {
        Node head=null;
        int size=0;

        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
        int pop(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            return x;

        }
        int peek(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            return head.val;
        }
    }
    public static void main(String[] args) {
        llstack st=new llstack();
        st.push(4);
        st.push(5);
        st.push(3);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
    }
}

   
