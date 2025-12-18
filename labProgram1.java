 /*Develop a Java program that prints all real solutions 
 to the quadratic equation ax2+bx+c = 0. 
 Read in a, b, c and use the quadratic formula. 
 If the discriminate b2-4ac is negative,
display a message stating that there are no real solutions.
 */ 
import java.util.*;
public class labProgram1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        {
            System.out.println("enter the coefficients of the quadratic equation");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            double d,r1,r2;
            d=b*b-4*a*c;
            if(a==0)
            {
                System.out.println("the equation is a liner one not quadratic");
            }
            else if(d>0)
            {
                r1=(-b+Math.sqrt(d))/(2*a);
                r2=(-b-Math.sqrt(d))/(2*a);
                System.out.println("the roots are real and distinct");
                System.out.println("root 1: "+r1);
                System.out.println("root 2: "+r2);
            }
            else if(d==0)
            {
                r1=-b/(2*a);
                r2=r1;
                System.out.println("the roots are real and equal");
                System.out.println("root 1: "+r1);
                System.out.println("root 2: "+r2);
            }
            else
            {
                r1=(-b)/(2.0*a);
                r2=Math.sqrt(Math.abs(d))/(2.0*a);
                System.out.println("the roots are imaginary and distinct");
                System.out.println("root 1: "+r1+"+i("+r2+")");
                System.out.println("root 2: "+r1+"-i("+r2+")");
            }
        }
    }
}

