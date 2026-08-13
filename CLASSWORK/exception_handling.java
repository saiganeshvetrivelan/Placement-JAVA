import java.util.Scanner;
public class exception_handling
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        try
        {
            c = a / b;
            System.out.println("Result: " + c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: Division by zero is not allowed.");
        }
        try
        {
            int[] arr = new int[5];
            System.out.println("Enter an index to access the array: ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Array index out of bounds.");
        }
        try
        {
            String str = null;
            System.out.println("Length of the string: " + str.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("Error: Null pointer exception.");
        }
        finally
        {
            sc.close();
            System.out.println("Scanner closed.");
        }
        
    }
}