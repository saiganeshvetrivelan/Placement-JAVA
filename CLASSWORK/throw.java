import java.util.*;
public class throw
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if(c>10000)
        {
            throw new RuntimeException("Number is greater than 1000");
        }
        else
        {
            System.out.println("Number is: " + c);
        }
        sc.close();

    }
}