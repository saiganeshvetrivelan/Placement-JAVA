import java.util.*;

class BankAccount
{
    int accountno;
    String name;
    String accounttype;
    double balance;

    void acceptDetails()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number:");
        accountno = sc.nextInt();

        System.out.println("Enter Customer Name:");
        name = sc.next();

        System.out.println("Enter Account Type:");
        accounttype = sc.next();

        System.out.println("Enter Initial Balance:");
        balance = sc.nextDouble();
    }

    void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    void display()
    {
        System.out.println("Account Number: " + accountno);
        System.out.println("Customer Name: " + name);
        System.out.println("Account Type: " + accounttype);
        System.out.println("Balance: " + balance);
    }

    void transfer(BankAccount b, double amount)
    {
        if (balance >= amount)
        {
            balance = balance - amount;
            b.balance = b.balance + amount;

            System.out.println("Transferred: " + amount);
            System.out.println("From Account: " + accountno);
            System.out.println("To Account: " + b.accountno);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    void transactionResult()
    {
        System.out.println("Account: " + accountno);
        System.out.println("Balance: " + balance);
    }
}

public class BankTransaction
{
    public static void main(String[] args)
    {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();
        BankAccount b3 = new BankAccount();

        System.out.println("Enter Account 1 Details");
        b1.acceptDetails();

        System.out.println("Enter Account 2 Details");
        b2.acceptDetails();

        System.out.println("Enter Account 3 Details");
        b3.acceptDetails();

        b1.deposit(10000);

        b2.deposit(5000);

        b1.transfer(b2, 3000);

        b2.withdraw(2000);

        System.out.println("\nFinal Account Details");

        b1.display();
        b2.display();
        b3.display();
    }
}