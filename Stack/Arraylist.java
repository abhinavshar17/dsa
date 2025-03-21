package Stack;
import java.util.*;

import sorting.selection;
public class Arraylist {

static class  Stack {
static ArrayList <Integer>list=new ArrayList<>();
 
    public static boolean isempty(){
        return list.size()==0;
    }

    //push:
    public static void push(int data){
        list.add(data);
    }
     // pop:
     public static int pop(){
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
     }
     //peek:
     public static int peek(){
        int top=list.get(list.size()-1);
        return top;
     }
}

    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        while(!s1.isempty()){
            System.out.println(s1.peek());
            s1.pop();
        }

    }
}
