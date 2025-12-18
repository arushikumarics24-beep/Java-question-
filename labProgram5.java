/*Develop a Java program to create a class Bank that
maintains two kinds of account for its customers, one
called savings account and the other current account. The
savings account provides compound interest and
withdrawal facilities but no cheque book facility. The
current account provides cheque book facility but no
interest. Current account holders should also maintain a
minimum balance and if the balance falls below this level,
a service charge is imposed.
Create a class Account that stores customer name,
account number and type of account. From this derive the
classes Cur-acct and Sav-acct to make them more specific
to their requirements. Include the necessary methods in
order to achieve the following tasks:
a) Accept deposit from customer and update
the balance.
b) Display the balance.
c) Compute and deposit interest
d) Permit withdrawal and update the balance
Check for the minimum balance, impose penalty if
necessary and update the balance. */
import java.util.*;
class Account 
{
    String name;
    int accno;
    int amount;
    Account(String name, int accno,int amount)
    {
        this.name=name;
        this.accno=accno;
        this.amount=amount;
    }
    void deposit(int depositAmount)
    {
        this.amount+=depositAmount;
        System.out.println("deposited sucessully");
    }
    void display()
    {
        System.out.println("The current amount is: "+this.amount);
    }
    void withdraw(int amt)
    {
        this.amount-=amt;
        System.out.println("amount wihtdrawn successfully");
    }

}
class Cur_account extends Account{
    int penalty =350;
    public Cur_account(String name, int accno,int amount) {
        super(name, accno, amount);
    }
    void checkBook()
    {
        System.out.println("ACCOUNT NO: "+accno);
        System.out.println("ACCOUNT BALANCE: "+amount);
    }
    void checkBalance()
    {
        if (amount<500)
        {
            this.amount-=247;
            System.out.println("A penalty has been levied on the account for low balance");
            System.out.println("CURRENT BALANCE="+this.amount);
        }
        else{
            System.out.println("the balance is sufficient");
        }
    }
}
class Sav_acc extends Account{
    public Sav_acc(String name, int accno,int amount) {
        super(name, accno, amount);
    }
    void calInterest()
    {
        this.amount+= this.amount*0.6;
    }
}
public class labProgram5
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        {
            System.out.println("ENTER THE TYPE OF ACCOUNT YOU WANT \n 1. SAVING \n 2.CURRENT");
            int choice=sc.nextInt();
            System.out.println("enter name");
            String name=sc.next();
            System.out.println("enter Amount");
            int amount=sc.nextInt();
            System.out.println("enter accno ");
            int accno=sc.nextInt();
            if(choice==1)
            {
                Cur_account cr=new Cur_account(name, accno, amount);
                cr.checkBalance();
                boolean cho=true;
                while(cho){
                    System.out.println("ENTER THE OPERATION YOU WANT: \n1.DEPOSIT\n2.WITHDRAW\n3.checkBook\n4.exit");
                    int ch=sc.nextInt();
                switch(ch)
                {
                    case 1:
                        System.out.println("Enter the deposit amount");
                        int amt=sc.nextInt();
                        cr.deposit(amt);
                        break;
                    case 2:
                        System.out.println("enter the withdrawal amount");
                        int amountWith=sc.nextInt();
                        cr.withdraw(amountWith);
                        break;
                    case 3:
                        cr.checkBook();
                        break;
                    case 4:
                        cho=false;
                        break;
                }
            }
            }
            if(choice==2)
                {
                    Sav_acc sv=new Sav_acc(name, accno, amount);
                    boolean cho=true;
                    while(cho){
                        System.out.println("ENTER THE OPERATION YOU WANT: \n1.DEPOSIT\n2.WITHDRAW\n3.calculate");
                    int ch=sc.nextInt();
                    switch(ch)
                    {
                        case 1:
                            System.out.println("Enter the deposit amount");
                            int amt=sc.nextInt();
                            sv.deposit(amt);
                            break;
                        case 2:
                            System.out.println("enter the withdrawal amount");
                            int amountWith=sc.nextInt();
                            sv.withdraw(amountWith);
                            break;
                        case 3:
                            sv.calInterest();
                            break;
                    }
                }
                }
        }
    }
}