import java.util.*;

class Employee
{
    int employeeId;
    String employeeName;
    double basicSalary;
    double hra;
    double da;
    double bonus;
    double tax;
    double grossSalary;
    double netSalary;

    void acceptDetails()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        employeeId = sc.nextInt();

        System.out.println("Enter Employee Name:");
        employeeName = sc.next();

        System.out.println("Enter Basic Salary:");
        basicSalary = sc.nextDouble();
    }

    void calculateHRA()
    {
        hra = basicSalary * 0.20;
    }

    void calculateDA()
    {
        da = basicSalary * 0.10;
    }

    void calculateBonus()
    {
        bonus = basicSalary * 0.05;
    }

    void calculateGrossSalary()
    {
        grossSalary = basicSalary + hra + da + bonus;
    }

    void calculateTax()
    {
        tax = grossSalary * 0.08;
    }

    void calculateNetSalary()
    {
        netSalary = grossSalary - tax;
    }

    void calculateSalary()
    {
        calculateHRA();
        calculateDA();
        calculateBonus();
        calculateGrossSalary();
        calculateTax();
        calculateNetSalary();
    }

    void display()
    {
        System.out.println("\nEmployee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Bonus: " + bonus);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Tax: " + tax);
        System.out.println("Net Salary: " + netSalary);
    }
}

public class EmployeSalary
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();

        System.out.println("Enter Employee 1 Details");
        e1.acceptDetails();
        e1.calculateSalary();

        System.out.println("\nEnter Employee 2 Details");
        e2.acceptDetails();
        e2.calculateSalary();

        System.out.println("\nEnter Employee 3 Details");
        e3.acceptDetails();
        e3.calculateSalary();

        System.out.println("\nEnter Employee 4 Details");
        e4.acceptDetails();
        e4.calculateSalary();

        System.out.println("\nEnter Employee 5 Details");
        e5.acceptDetails();
        e5.calculateSalary();

        System.out.println("\n===== EMPLOYEE SALARY DETAILS =====");

        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();

        Employee highest = e1;

        if (e2.netSalary > highest.netSalary)
            highest = e2;

        if (e3.netSalary > highest.netSalary)
            highest = e3;

        if (e4.netSalary > highest.netSalary)
            highest = e4;

        if (e5.netSalary > highest.netSalary)
            highest = e5;

        Employee lowest = e1;

        if (e2.netSalary < lowest.netSalary)
            lowest = e2;

        if (e3.netSalary < lowest.netSalary)
            lowest = e3;

        if (e4.netSalary < lowest.netSalary)
            lowest = e4;

        if (e5.netSalary < lowest.netSalary)
            lowest = e5;

        double averageSalary =
                (e1.netSalary + e2.netSalary + e3.netSalary
                + e4.netSalary + e5.netSalary) / 5;

        System.out.println("\n===== SALARY ANALYSIS =====");

        System.out.println("Highest Salary: " + highest.employeeName);
        System.out.println("Net Salary: " + highest.netSalary);

        System.out.println("\nLowest Salary: " + lowest.employeeName);
        System.out.println("Net Salary: " + lowest.netSalary);

        System.out.println("\nAverage Salary: " + averageSalary);
    }
}