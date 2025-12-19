import CIE.*;
import SEE.*;
import java.util.*;
public class labProgram6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        {
            
            System.out.println("enter the number of students");
            int n=sc.nextInt();
            Internals internal[]=new Internals[n];
            External external[]=new External[n];
            for(int i=0;i<n;i++)
            {
                System.out.println("enter name , Usn , semester in order");
                String name=sc.next();
                int Usn=sc.nextInt();
                int sem=sc.nextInt();
                System.out.println("enter internal and external marks for 5 subjects consequently");
                int irr[]=new int [5];
                int err[]=new int [5];
                for(int j=0;j<5;j++)
                {
                    irr[j]=sc.nextInt();
                    err[j]=sc.nextInt();
                }
                internal[i]=new Internals(irr);
                external[i]=new External(Usn, sem, name, err);
            }
            for(int i=0;i<n;i++)
            {
                System.out.println("----details of student "+(i+1));
                external[i].DisplayDetails();
                System.out.println("FINAL MARKS");
                for(int j=0;j<5;j++)
                {
                    System.out.println("Subject "+(j+1)+":"+((internal[i].internals[j])+(external[i].externals[j])));
                }
            }
        }
    }
}
