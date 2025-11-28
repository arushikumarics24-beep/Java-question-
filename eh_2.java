// Custom Exception for Marks
class LowMarksException extends Exception {
    public LowMarksException(String message) {
        super(message);
    }
}

// Base Class
class Student {
    protected int marks;

    // Constructor
    public Student(int marks) throws LowMarksException {
        if (marks < 35) {
            throw new LowMarksException("Marks too low! Minimum passing marks for Student is 35.");
        }
        this.marks = marks;
    }

    public void display() {
        System.out.println("Student Marks: " + marks);
    }
}

// Derived Class
class GraduateStudent extends Student {

    public GraduateStudent(int marks) throws LowMarksException {
        super(marks);  // Calls Student constructor for basic check (>= 35)

        if (marks < 50) {
            throw new LowMarksException("Marks too low! Graduate Student must have at least 50.");
        }
    }

    public void showType() {
        System.out.println("This is a Graduate Student.");
    }
}

// Main Class
public class eh_2 {
    public static void main(String[] args) {

        System.out.println("Trying to create GraduateStudent with 40 marks...");

        try {
            GraduateStudent g1 = new GraduateStudent(40);
            g1.showType();
            g1.display();
        } catch (LowMarksException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("\nTrying with valid marks...\n");

        try {
            GraduateStudent g2 = new GraduateStudent(75);
            g2.showType();
            g2.display();
        } catch (LowMarksException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
