// Class definition
class Student {
    // Instance variables
    private int id;
    private String name;
    // Constant
    public static final String COLLEGE = "ABC College";

    // Constructor
    Student(int id, String name) {
        this.id = id; // using this keyword
        this.name = name;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("College: " + COLLEGE);
    }
}

// Main class
public class ClassDemo {
    public static void main(String[] args) {
        // Creating objects using new
        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(102, "Anita");

        // Reference variables
        Student ref;
        ref = s1;

        // Calling methods
        ref.display();
        System.out.println();
        s2.display();
    }
}