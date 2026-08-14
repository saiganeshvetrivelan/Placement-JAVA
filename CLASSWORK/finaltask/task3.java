class Datasecure
{
    private int accountNumber = 999;
     private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private long balance = 500000;
    Datasecure(String accountHolderName, String mobileNumber, String accountType)
    {
        
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;

    }
    void display()
    {
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Mobile Number: "+mobileNumber);
        System.out.println("Account Type: "+accountType);
        System.out.println("Balance: "+balance);
    }
   
}
class task3
{
    public static void main(String[] args)
    {
        Datasecure c=new Datasecure("SAI", "1438424668", "Current");
        c.display();

    }
}