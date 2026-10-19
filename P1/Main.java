


class Student {
    // Instance Variables
    int rollNo;
    String name;
    int marks1, marks2, marks3;

    // Constructor - Parameterized Constructor
    Student(int rollNo, String name, int m1, int m2, int m3) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    
    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }


    void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("-------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(9, "Abhishek Kumar Gupta", 85, 90, 88);
        Student s2 = new Student(10, "Rahul Sharma", 78, 82, 80);
        Student s3 = new Student(11, "Priya Singh", 92, 89, 95);

        System.out.println("=== Student Details ===\n");
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();

        System.out.println("\n=== IDENTIFICATION ===");
        System.out.println("Class: Student, Main");
        System.out.println("Objects: s1, s2, s3");
        System.out.println("Instance Variables: rollNo, name, marks1, marks2, marks3");
        System.out.println("Constructor: Student(int, String, int, int, int)");
        System.out.println("Methods: calculateTotal(), calculatePercentage(), displayDetails()");
    }
}
