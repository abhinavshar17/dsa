package oops;

public class Inheritance {
    public static void main(String[] args) {
        // Fish star=new Fish();
        // star.eat(); 

        //multi :
        Dog d1= new Dog();
        d1.breath();
        
    }
    
}

    //base class:
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}
                                    //derived class
                                    // class Fish extends Animal{
                                    //     int fins;
                                    //     void swim(){
                                    //         System.out.println("can swim");
                                    //     }
                                    // }


           // MULTI LEVEL INHERITANCE:
           
           class Mammals extends Animal{
            int legs;
           }
           
           class Dog extends Mammals{
            String breed;
           }