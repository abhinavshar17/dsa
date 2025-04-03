package Stack;
import java.util.*;
public class Insertion {
    public static void main(String[] args) {
       
        Stack <Integer> st =new Stack<>(); 

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

System.out.println(st);

        int x=7;
        int index=2;
Stack<Integer> n1=new Stack<>();
while(st.size()>index){
    n1.push(st.pop());
}
st.push(x);
while(n1.size()>0){
    st.push(n1.pop());
}
System.out.println(st);
    }
}