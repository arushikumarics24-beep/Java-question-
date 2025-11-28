// Base class Father
class Father {
    int fatherAge;

    Father(int age) throws Exception {
        if (age < 0) {
            throw new Exception("Father's age cannot be negative!");
        }
        fatherAge = age;
    }
}

// Derived class Son
class Son extends Father {
    int sonAge;

    Son(int fatherAge, int sonAge) throws Exception {
        super(fatherAge);  // Call Father constructor

        if (sonAge >= fatherAge) {
            throw new Exception("Son's age must be less than Father's age!");
        }

        this.sonAge = sonAge;
    }
}

// Main class for testing
public class program7 {
    public static void main(String[] args) {

        try {
            Son s1 = new Son(45, 20);
            System.out.println("Valid ages: Father=45, Son=20");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            Son s2 = new Son(-50, 10);  // Father age invalid
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            Son s3 = new Son(30, 30);  // Son >= father
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

