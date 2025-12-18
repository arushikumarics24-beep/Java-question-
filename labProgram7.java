/*Write a program that demonstrates handling of
exceptions in inheritance tree. Create a base class called
“Father” and derived class called “Son” which extends the
base class. In Father class, implement a constructor which
takes the age and throws the exception WrongAge( ) when
the input age<0. In Son class, implement a constructor
that uses both father and son’s age and throws an
exception if son’s age is >=father’s age.*/
class WrongAgeException extends Exception{

    public WrongAgeException(String msg) {
        super(msg);
    }
    
}
class Father 
{
    Father(int age) throws WrongAgeException
    {
        int fAge;
        if(age<0)
        {
            throw new WrongAgeException("Father's age cannot be negative");
        }
        fAge=age;
    }
}
class son extends Father{
    son(int fage,int sage)throws WrongAgeException
    {
        super(fage);
        int Sage;
        if(sage>fage||sage<0){throw new WrongAgeException("SON'S age is invalid");}
        Sage=sage;
    }
   
}
public class labProgram7
{
    public static void main(String[] args) {
        try {
            son s=new son(12,24);
            System.out.println("correct ages");
            System.out.println("father's age=12\nson's age=24");
        } catch (WrongAgeException e) {
            System.out.println(e);
        }
    }
}