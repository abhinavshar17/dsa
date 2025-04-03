package Stack;
import java.util.*;
public class Movestack {
    public static void main(String[] args) {
       
        Stack <Integer> st =new Stack<>(); 

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
System.out.println(st);

//reverse order
Stack<Integer> rv=new Stack<>();
while(st.size()>0){
    
    rv.push((st.pop()));
 

}
Stack<Integer> dj=new Stack<>();
while(rv.size()>0){
    dj.push(rv.pop());
}
System.out.println(dj);
    }
  
}
