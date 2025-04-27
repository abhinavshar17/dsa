package Stack;
import java.util.*;

public class Display {
    public static void dis(Stack<Integer> st) {
        if(st.size()==0) return;
        int top=st.pop();
        System.out.print(top+" ");
        dis(st);
        st.push(top);
    }

    public static void main(String[] args) {
   Stack<Integer> st =new Stack<>();
   st.push(10);
   st.push(20);
   st.push(30);
   st.push(40);
   
   dis(st);
   
}

}
