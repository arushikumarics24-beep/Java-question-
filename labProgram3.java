/*Create a class Book which contains four members: name,
author, price, num_pages. Include a constructor to set the
values for the members. Include methods to set and get
the details of the objects. Include a toString( ) method that
could display the complete details of the book. Develop a
Java program to create n book objects. */
import java.util.*;
class Book{
    int price,num_pages;
    String name,author;
    Book(String name, String author, int price, int num_pages)
    {
        this.name=name;
        this.price=price;
        this.author=author;
        this.num_pages=num_pages;
    }
    String getName(){return this.name;}
    int getPrice(){return this.price; }
    String getAuthor(){return this.author;}
    int getNUM_PAGES(){ return this.num_pages;}
    void setName(String name){this.name=name;}
    void setauthor(String author){this.author=author;}
    void setPrice(int price){this.price=price;}
    void setnum_pages(int num_pages){this.num_pages=num_pages;}

    public String toString()
    {
        return "\nBOOK NAME:"+this.name+"\nAUTHOR:"+this.author+"\nPRICE:"+this.price+"\nNUM_PAGES"+this.num_pages;
    }
}
public class labProgram3 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        {
            System.err.println("enter the number of books: \n");
            int n=sc.nextInt();
            Book b[]=new Book[n];
            System.out.println("Enter details");
            for(int i=0;i<n;i++)
            {
                System.out.println("BOOK "+(i+1));
                System.out.println("ENTER NAME of the book : ");
                String name=sc.next();
                System.out.println("ENTER AUTHOR:");
                String author=sc.next();
                System.out.println("enter no of pages in the book: ");
                int no_of_pages=sc.nextInt();
                System.out.println("enter price of the book: ");
                int price=sc.nextInt();
                b[i]=new Book(name, author, price, no_of_pages);
            }
            for(int i=0;i<n;i++)
            {
                System.err.println("\n\n-----------------------");
                System.out.println(" BOOK "+(i+1)+" DETAILS: "+b[i]);
            }
        }
    }
}
