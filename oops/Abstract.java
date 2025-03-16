package oops;

public class Abstract {
   public static void main(String[] args) {
    Horse h=new Horse();
    h.eat();
    h.walk();
    h.changeColor();
System.out.println(h.color);
   }
}

abstract class Animal{ //----> we cannot create object for abstact classes
  String color;
    Animal(){
color="brown";
    }
    
    void eat(){
        System.out.println("animal eat");
    }

//idea:implementation nhi diya bs bta diya ik walk naam ka function hai baaki 
//subclass aapne hissab se bna lo
    abstract void walk(); 

    
}
class Horse extends Animal{
    void changeColor(){
        color="dark";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color="white";
    }
    void walk(){
        System.out.println("on 2 legs");
    }
}
