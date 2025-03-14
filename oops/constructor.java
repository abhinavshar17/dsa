package oops;

public class constructor {
    public static void main(String[] args) {
        Student s1=new Student("abhinav",99);
        System.out.println(s1.name +" "+s1.marks);
        
    }
}
class Student{
    int marks;
    String name;

    //self creating a constructor in java constructor creation is by default
    Student(String name,int marks){
        System.out.println("constructor is called");
       this.name=name;
       this.marks=marks;
    }
}