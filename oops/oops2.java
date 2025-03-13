package oops;

public class oops2 {
    public static void main(String[] args) {
        Bankdetails b1 = new Bankdetails();
        b1.username = "Abhinav";
        b1.setPass("abhi752005"); // Now setting the password correctly
        System.out.println("Password: " + b1.getpass());

        student s1 = new student();
        s1.setmarks(88);
        s1.setname("Abhinav");
        System.out.println("Marks: " + s1.getmarks());
        System.out.println("Student Name: " + s1.getname());
    }
}

class Bankdetails {
    public String username;
    private String password;

    // Getter for password
    public String getpass() {
        return this.password;
    }

    // Setter for password
    public void setPass(String newPass) {
        password = newPass;
    }
}

class student {
    private String name;
    private int marks;

    // Getters
    public String getname() { // Changed to public
        return this.name;
    }

    public int getmarks() { // Changed to public
        return this.marks;
    }

    // Setters (Made public)
    public void setname(String newName) { // Changed to public
        this.name = newName;
    }

    public void setmarks(int newMarks) { // Changed to public
        this.marks = newMarks;
    }
}
