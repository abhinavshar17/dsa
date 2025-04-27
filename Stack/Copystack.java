package Stack;
import java.util.*;
public class Copystack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        //input
        int n;
        System.out.println("enter the  no. of elemnets u want to insert");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        
        //new stack:
        Stack<Integer> st2=new Stack<>();
        while(st.size()>0){
            
            st2.push(st.pop());
         
        }
        System.out.println(st2);
    }
}
