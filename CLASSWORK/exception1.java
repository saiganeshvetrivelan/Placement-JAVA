class exception1 {
  

    public static void main(String[] args)
    {
      int balance = 1000;
      int withdrawAmount = 1500;
      if (balance >= withdrawAmount)
      {
        try
        {
          balance = balance - withdrawAmount;
          System.out.println("Withdrawn: " + withdrawAmount);
          System.out.println("Balance: " + balance);
        }
        catch (Exception e)
        {
          System.out.println("Error: " + e.getMessage());
        }
    }
    }
    }

