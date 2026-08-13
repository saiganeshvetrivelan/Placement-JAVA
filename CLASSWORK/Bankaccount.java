import java.util.*;
class Bank
{
    void deposit(double amount)
    {
        System.out.println("Deposited: " + amount);
    }
    void deposit(double amount , String desc)
    {
        System.out.println("Deposited: " + amount + " for " + desc);
    }
    void deposit(double amount , String desc , int id_no)
    {
        System.out.println("Deposited: " + amount + " for " + desc + " with id_no: " + id_no);  
    }
}
class current extends Bank
{
    void interest(int amount)
    {
        System.out.println("Interest is 2% "+ (amount*0.02));
    }
}
class saving extends Bank
{
    void interest(int amount)
    {
        System.out.println("Interest is 6% "+ (amount*0.06));
    }
}
public class Bankaccount
{
    public static void main(String[] args)
    {
        current c = new current();
        saving s = new saving();
        c.deposit(1000);
        c.deposit(1000 , "Salary");
        c.deposit(1000 , "Salary" , 1234);
        c.interest(1000);
        s.deposit(1000);
        s.deposit(1000 , "Salary");
        s.deposit(1000 , "Salary" , 1234);
        s.interest(1000);
        
    }
}