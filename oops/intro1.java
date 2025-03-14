package oops;

public class intro1 {

    public static void main(String[] args) {
        Pen p1=new Pen();  //constructor
        //pen object called p1
        p1.setColor("black");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);
        
 Student s1=new Student();
 s1.cal(90, 88, 97);
 System.out.println(s1.percentage);
    }
}
//class pen:
class Pen{
String color;
int tip;

void setColor(String newColor){
color=newColor;

}
void setTip(int newTip){
    tip=newTip;
}
}

//student class
class Student{
String name;
int percentage;
int age;

void cal(int physics,int maths,int chemistry){
percentage=(physics+maths+chemistry)/3;

}
}