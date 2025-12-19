/*Write a program which creates two threads, one thread
displaying “BMS College of Engineering” once every ten
seconds and another displaying “CSE” once every two
seconds.*/
class college extends Thread
{
    public void run()
    {
        try{
            while(true){
        System.out.println("BMS College of Engineering");
        Thread.sleep(10000);
            }
        }
        catch(InterruptedException e)
        {
           e.printStackTrace();
        }
    }

}
class branch extends Thread{
    public void run()
    {
        try {
            while(true){
            System.out.println("CSE");
            Thread.sleep(2000);}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class labProgram8 {
    public static void main(String[] args) {
        branch b=new branch();
        college c=new college();
        c.start();
        b.start();
    }

}
