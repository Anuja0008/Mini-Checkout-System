import java.util.Scanner;

public class MiniCheckout {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double subtotal = 0.0;
            double taxRate = 0.055; // Replace with your tax rate

            // Get item details in a loop
            for (int i = 1; i <= 3; i++) {
                System.out.printf("Enter price of item %d: ", i);
                double price = scanner.nextDouble();
                System.out.printf("Enter quantity of item %d: ", i);
                int quantity = scanner.nextInt();
                
                double subprice=price*quantity;
                subtotal =subtotal+subprice;
            }

            // Calculate tax and total
            double tax = subtotal * taxRate;
            double total = subtotal + tax;

            // Display receipt
            System.out.println("\n--- Receipt ---");
            System.out.printf("Subtotal: $%.2f\n", subtotal);
            System.out.printf("Tax: $%.2f\n", tax);
            System.out.printf("Total: $%.2f\n", total);
        }
    }
}
