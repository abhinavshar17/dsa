package Stack;

import java.util.*;
public class Syntax {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        //peek
        System.out.println(st.peek());
        st.pop(); 
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }
}
