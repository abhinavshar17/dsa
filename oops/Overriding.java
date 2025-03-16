package oops;
// run time polymorphism
public class Overriding {
    public static void main(String[] args) {
        Dear d1=new Dear();
        d1.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("EAts anything");
    }
}
class Dear extends Animal{
    void eat(){
        System.out.println("eats grass onlyy");
    }
}
