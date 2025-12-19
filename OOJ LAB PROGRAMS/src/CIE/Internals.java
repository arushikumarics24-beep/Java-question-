package CIE;
/*Create a package CIE which has two classes – Personal and Internals. 
The class Personal has members like usn, name, sem. 
The class Internals has an array that stores the internal marks scored in
 five courses of the current semester 
of the student. Create another package SEE which has 
the class External which is a derived class of Personal.
 This class has an array that stores the SEE marks scored 
 in five courses of the current semester of the student.
  Import the two packages in a file that declares the final marks
   of n students in all five courses */ 
public class Internals {
    public int internals[]=new int[5];

    public Internals(int arr[]) {
        for(int i=0;i<5;i++)
        {
            this.internals[i]=arr[i];
        }
    }
    

}
