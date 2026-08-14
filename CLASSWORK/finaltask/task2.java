class details{
    String AccountNumber;
    String AccountHolderName;
    String MobileNumber;
    String AccountType;
    long balance;
    void display()
    {
        System.out.println("Account Number: "+AccountNumber);
        System.out.println("Account Holder Name: "+AccountHolderName);
        System.out.println("Mobile Number: "+MobileNumber);
        System.out.println("Account Type: "+AccountType);
        System.out.println("Balance: "+balance);
    }

}
class task2
{
    public static void main(String[] args)
    {
        details customer1=new details();
        customer1.AccountNumber="5645464565";
        customer1.AccountHolderName="Nekelash";
        customer1.MobileNumber="9876543210";
        customer1.AccountType="Savings";
        customer1.balance=50000;
        customer1.display();
        
        System.out.println();
        
        details customer2=new details();
        customer2.AccountNumber="7418161161";
        customer2.AccountHolderName="Ajay";
        customer2.MobileNumber="8765432109";
        customer2.AccountType="Current";
        customer2.balance=10000;
        customer2.display();
    }
}