package Poc;
import java.util.Scanner;

public class SuperMarket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int count = 0;
        double total = 0;
        double discount = 0;
        double finalAmount = 0;

        while (true) {

            System.out.println("\n===== SUPERMARKET MANAGEMENT =====");
            System.out.println("1. Add Product");
            System.out.println("2. Calculate Bill");
            System.out.println("3. Apply Discount");
            System.out.println("4. Display Final Amount");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number of products: ");
                    count = sc.nextInt();

                    for (int i = 1; i <= count; i++) {

                        System.out.print("Enter product name: ");
                        String name = sc.next();

                        System.out.print("Enter product price: ");
                        double price = sc.nextDouble();

                        total = total + price;

                        System.out.println(name + " added successfully!");
                    }
                    break;

                case 2:
                    System.out.println("Total Bill: " + total);
                    break;

                case 3:
                    if (total > 10000) {
                        discount = total * 15 / 100;
                        finalAmount = total - discount;

                        System.out.println("Discount Applied: " + discount);
                    } else {
                        discount = 0;
                        finalAmount = total;

                        System.out.println("No Discount Applied.");
                    }
                    break;

                case 4:
                    finalAmount = total - discount;

                    System.out.println("========== FINAL BILL ==========");
                    System.out.println("Total Amount: " + total);
                    System.out.println("Discount: " + discount);
                    System.out.println("Final Amount: " + finalAmount);
                    System.out.println("================================");
                    break;

                case 5:
                    System.out.println("Thank you for shopping!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}

