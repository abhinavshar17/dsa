package oops;

public class Copy {
    public static void main(String[] args) {
        Stu s1=new Stu();
            s1.name="abhinav";
            s1.roll=1;
            s1.pass="abhi";
            s1.marks[0]=100;
            s1.marks[1]=90;
            s1.marks[2]=80;

            Stu s2=new Stu(s1);// copy cons called
            s2.pass="hihi";
            s2.marks[2]=100000; 
           
            for(int i=0;i<3;i++){
                System.out.println(s2.marks[i]);
                
}
for(int i=0;i<3;i++){
    System.out.println(s1.marks[i]);
}
    }
}
//default 
class Stu{
    String name;
    int roll;
    String pass;
    int marks[];

    // shallow copy constuctor 
// Stu(Stu s1){
// this.name=s1.name;
// this.roll=s1.roll;
// this.pass=s1.pass;
// this.marks=s1.marks;

// }

// deep copy construc.
Stu(Stu s1){
  marks=new int[s1.marks.length];
this.name=s1.name;
this.pass=s1.pass;
this.roll=s1.roll;
 
//but for marks we will create a whole brand new array::
        for(int i=0;i<s1.marks.length;i++){
            this.marks[i]=s1.marks[i];
        }

}

    Stu(){
      marks=new int[3];
        System.out.println("constuctor called");
    }
    Stu(String name,int roll,String pass,int marks){
        this.name=name;
        this.roll=roll;
        this.pass=pass;
        this.marks=new int[3];
        
        
    }

}
