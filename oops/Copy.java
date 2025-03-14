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

            Stu s2=new Stu(s1);
            s2.pass="hihi";
            s2.marks[2]=10; 
            System.out.println(s2.pass);
            for(int i=0;i<3;i++){
                System.out.println(s2.marks[i]);
}
    }
}
//default 
class Stu{
    String name;
    int roll;
    String pass;
    int marks[];

    //copy constuctor 
Stu(Stu s1){
this.name=s1.name;
this.roll=s1.roll;
this.pass=s1.pass;
this.marks=s1.marks;

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
