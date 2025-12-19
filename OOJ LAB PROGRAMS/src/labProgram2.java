/*Develop a Java program to create a class Student with
members usn, name, an array credits and an array marks.
Include methods to accept and display details and a
method to calculate SGPA of a student. */
import java.util.*;
class Student{
    int USN;
    String name;
    int credits[]=new int [5];
    int marks[]=new int[5];
    double SGPA;
    void acceptDetails(int USN, String name, int credits[],int marks[])
    {
        this.name=name;
        this.USN=USN;
        for(int i=0;i<5;i++)
        {
            this.credits[i]=credits[i];
            this.marks[i]=marks[i];
        }
    }
    void calculateSGPA()
    {
        double total=0.0,sum=0.0;
        for(int i=0;i<5;i++)
        {
            total=total+(this.marks[i]*this.credits[i]);
            sum+=this.credits[i];
        }
        SGPA=total/sum;
        System.out.println("the SGPA IS:"+SGPA);
    }
    void display()
    {
        System.out.println("USN:"+this.USN);
        System.out.println("NAME:"+this.name);
        System.out.println("SGPA:"+this.SGPA);
    }
}
public class labProgram2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        {
            System.out.println("ENTER NAME:");
            String name=sc.next();
            System.out.println("ENTER USN");
            int USN=sc.nextInt();
            System.out.println("ENTER CREDITS FOR 5 SUBJECTS");
            System.out.println("ENTER MARKS FOR 5 SUBJECTS SUBSEQUENTLY");
            int credits[]=new int[5];
            int marks[]=new int[5];
            for(int i=0;i<5;i++){
                credits[i]=sc.nextInt();
                marks[i]=sc.nextInt();
            }
           Student s=new Student();
           s.acceptDetails(USN, name, credits, marks);
           s.calculateSGPA();
           s.display();
        }
    }
}
