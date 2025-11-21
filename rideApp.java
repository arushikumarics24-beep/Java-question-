import java.util.*;
interface ride{
    double calculateFare(double Distance);
    String getRideType();
}
class mini implements ride{
    public double calculateFare(double Distance){
        double fare = Distance*72;
        return fare;
    }
    public String getRideType()
    {
        return "mini";
    }
}
class prime implements ride{
    public double calculateFare(double Distance){
        double fare = Distance*84;
        return fare;
    }
    public String getRideType()
    {
        return "prime";
    }
}
class SUV implements ride{
    public double calculateFare(double Distance){
        double fare = Distance*95;
        return fare;
    }
    public String getRideType()
    {
        return "SUV";
    }
}


public class rideApp{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    {
        System.out.println("enter your choice \n 1.mini \n 2.prime \n 3.SUV");
        int ch=sc.nextInt();
        ride car=null;
        switch(ch)
        {
            case 1:
                car=new mini();
                break;
            case 2:
                car=new prime();
                break;
            case 3:
                car=new SUV();
                break;
           default:System.out.println("invalid choice");
        }
        System.out.println("enter distance");
        double distance =sc.nextDouble();
        System.out.println("RIDE TYPE: "+car.getRideType());
        System.out.println("FARE Rs"+car.calculateFare(distance));

    }
}
}