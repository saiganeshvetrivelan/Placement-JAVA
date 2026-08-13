import java.util.Scanner;
class Student {
    int id;
    String name;
    int mark1, mark2, mark3, mark4, mark5;
    int total;
    double average;
    char grade;
    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        id = sc.nextInt();
        System.out.print("Enter Student Name: ");
        name = sc.next();
        System.out.print("Enter mark 1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter mark 2: ");
        mark2 = sc.nextInt();
        System.out.print("Enter mark 3: ");
        mark3 = sc.nextInt();
        System.out.print("Enter mark 4: ");
        mark4 = sc.nextInt();
        System.out.print("Enter mark 5: ");
        mark5 = sc.nextInt();
    }
    void calculateTotalAverage() {
        total = mark1 + mark2 + mark3 + mark4 + mark5;
        average = total / 5.0;
    }
    void calculateGrade() {
        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else if (average >= 50)
            grade = 'E';
        else
            grade = 'F';
    }
    void displayResult() {
        System.out.println("\n----- Student Result -----");
        System.out.println("Student ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Total      : " + total);
        System.out.println("Average    : " + average);
        System.out.println("Grade      : " + grade);
    }
}
public class StudentResult {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        System.out.println("\nEnter Student 1 Details");
        s1.acceptDetails();
        s1.calculateTotalAverage();
        s1.calculateGrade();
        System.out.println("\nEnter Student 2 Details");
        s2.acceptDetails();
        s2.calculateTotalAverage();
        s2.calculateGrade();
        System.out.println("\nEnter Student 3 Details");
        s3.acceptDetails();
        s3.calculateTotalAverage();
        s3.calculateGrade();
        System.out.println("\nEnter Student 4 Details");
        s4.acceptDetails();
        s4.calculateTotalAverage();
        s4.calculateGrade();
        System.out.println("\nEnter Student 5 Details");
        s5.acceptDetails();
        s5.calculateTotalAverage();
        s5.calculateGrade();
        s1.displayResult();
        s2.displayResult();
        s3.displayResult();
        s4.displayResult();
        s5.displayResult();
        Student highest = s1;
        if (s2.total > highest.total)
            highest = s2;
        if (s3.total > highest.total)
            highest = s3;
        if (s4.total > highest.total)
            highest = s4;
        if (s5.total > highest.total)
            highest = s5;
        Student lowest = s1;
        if (s2.total < lowest.total)
            lowest = s2;
        if (s3.total < lowest.total)
            lowest = s3;
        if (s4.total < lowest.total)
            lowest = s4;
        if (s5.total < lowest.total)
            lowest = s5;
        double classAverage =
                (s1.average + s2.average + s3.average
                + s4.average + s5.average) / 5;
        System.out.println("\n===== CLASS DETAILS =====");
        System.out.println("\nHighest Total:");
        System.out.println("Name  : " + highest.name);
        System.out.println("Total : " + highest.total);
        System.out.println("\nLowest Total:");
        System.out.println("Name  : " + lowest.name);
        System.out.println("Total : " + lowest.total);
        System.out.println("\nClass Average: " + classAverage);
    }
}