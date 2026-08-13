import java.util.*;

class Product
{
    int productId;
    String productName;
    double price;
    int quantity;

    void acceptDetails()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product ID:");
        productId = sc.nextInt();

        System.out.println("Enter Product Name:");
        productName = sc.next();

        System.out.println("Enter Price:");
        price = sc.nextDouble();

        System.out.println("Enter Quantity:");
        quantity = sc.nextInt();
    }

    double calculateTotal()
    {
        return price * quantity;
    }

    double applyDiscount(double subtotal)
    {
        if (subtotal >= 10000)
            return subtotal * 0.10;
        else if (subtotal >= 5000)
            return subtotal * 0.05;
        else
            return 0;
    }

    void display()
    {
        System.out.println("\nProduct ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Product Total: " + calculateTotal());
    }
}

public class Billing
{
    public static void main(String[] args)
    {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();
        Product p5 = new Product();

        System.out.println("Enter Product 1 Details");
        p1.acceptDetails();

        System.out.println("\nEnter Product 2 Details");
        p2.acceptDetails();

        System.out.println("\nEnter Product 3 Details");
        p3.acceptDetails();

        System.out.println("\nEnter Product 4 Details");
        p4.acceptDetails();

        System.out.println("\nEnter Product 5 Details");
        p5.acceptDetails();

        double subtotal = p1.calculateTotal()
                        + p2.calculateTotal()
                        + p3.calculateTotal()
                        + p4.calculateTotal()
                        + p5.calculateTotal();

        double discount;

        if (subtotal >= 10000)
            discount = subtotal * 0.10;
        else if (subtotal >= 5000)
            discount = subtotal * 0.05;
        else
            discount = 0;

        double amountAfterDiscount = subtotal - discount;

        double gst = amountAfterDiscount * 0.18;

        double finalAmount = amountAfterDiscount + gst;

        Product expensive = p1;

        if (p2.price > expensive.price)
            expensive = p2;

        if (p3.price > expensive.price)
            expensive = p3;

        if (p4.price > expensive.price)
            expensive = p4;

        if (p5.price > expensive.price)
            expensive = p5;

        Product cheapest = p1;

        if (p2.price < cheapest.price)
            cheapest = p2;

        if (p3.price < cheapest.price)
            cheapest = p3;

        if (p4.price < cheapest.price)
            cheapest = p4;

        if (p5.price < cheapest.price)
            cheapest = p5;

        Product highestQuantity = p1;

        if (p2.quantity > highestQuantity.quantity)
            highestQuantity = p2;

        if (p3.quantity > highestQuantity.quantity)
            highestQuantity = p3;

        if (p4.quantity > highestQuantity.quantity)
            highestQuantity = p4;

        if (p5.quantity > highestQuantity.quantity)
            highestQuantity = p5;

        int totalItems = p1.quantity
                       + p2.quantity
                       + p3.quantity
                       + p4.quantity
                       + p5.quantity;

        System.out.println("\n===== PRODUCT DETAILS =====");

        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();

        System.out.println("\n===== BILL =====");
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount: " + discount);
        System.out.println("GST (18%): " + gst);
        System.out.println("Final Bill Amount: " + finalAmount);

        System.out.println("\n===== PRODUCT ANALYSIS =====");
        System.out.println("Most Expensive Product: " + expensive.productName);
        System.out.println("Price: " + expensive.price);

        System.out.println("Cheapest Product: " + cheapest.productName);
        System.out.println("Price: " + cheapest.price);

        System.out.println("Highest Quantity Product: " + highestQuantity.productName);
        System.out.println("Quantity: " + highestQuantity.quantity);

        System.out.println("Total Number of Items: " + totalItems);
    }
}