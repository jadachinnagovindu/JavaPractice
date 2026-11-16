
package Poc;

import java.util.Scanner;

public class Library_Management_System {

    static Scanner sc = new Scanner(System.in);

    static int[] bookIds = new int[100];
    static String[] bookNames = new String[100];
    static String[] authors = new String[100];
    static double[] prices = new double[100];
    static boolean[] available = new boolean[100];

    static int count = 0;

    public static void main(String[] args) {

        String choice;

        do {
            System.out.println("\n========== Library Management System ==========");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");
            System.out.println("Enter your Choice:");

            choice = sc.next();

            switch (choice) {

                case "1" -> addBook();

                case "2" -> displayBooks();

                case "3" -> searchBook();

                case "4" -> issueBook();

                case "5" -> returnBook();

                case "6" -> deleteBook();

                case "7" -> System.out.println("Thank you!");

                default -> System.out.println("Invalid Option");
            }

        } while (!choice.equals("7"));

        sc.close();
    }

    // Add Book
    static void addBook() {

        if (count == bookIds.length) {
            System.out.println("Library storage is full!");
            return;
        }

        System.out.println("Enter Book ID:");
        int id = sc.nextInt();

        if (findBook(id) != -1) {
            System.out.println("Book ID already exists!");
            return;
        }

        sc.nextLine();

        System.out.println("Enter Book Name:");
        String name = sc.nextLine();

        System.out.println("Enter Author Name:");
        String author = sc.nextLine();

        System.out.println("Enter Book Price:");
        double price = sc.nextDouble();

        if (price < 0) {
            System.out.println("Invalid price!");
            return;
        }

        bookIds[count] = id;
        bookNames[count] = name;
        authors[count] = author;
        prices[count] = price;
        available[count] = true;

        count++;

        System.out.println("Book Added Successfully!");
    }

    // Display All Books
    static void displayBooks() {

        if (count == 0) {
            System.out.println("No Books Available!");
            return;
        }

        System.out.println("\n========== Book Details ==========");

        for (int i = 0; i < count; i++) {

            System.out.println("Book ID: " + bookIds[i]);
            System.out.println("Book Name: " + bookNames[i]);
            System.out.println("Author: " + authors[i]);
            System.out.println("Price: " + prices[i]);
            System.out.println("Available: " + available[i]);

            System.out.println("--------------------------------");
        }
    }

    // Search Book
    static void searchBook() {

        System.out.println("Enter Book ID to Search:");
        int id = sc.nextInt();

        int index = findBook(id);

        if (index == -1) {
            System.out.println("Book Not Found!");
        } else {
            System.out.println("Book Found!");
            System.out.println("Book Name: " + bookNames[index]);
            System.out.println("Author: " + authors[index]);
            System.out.println("Price: " + prices[index]);
            System.out.println("Available: " + available[index]);
        }
    }

    // Issue Book
    static void issueBook() {

        System.out.println("Enter Book ID to Issue:");
        int id = sc.nextInt();

        int index = findBook(id);

        if (index == -1) {
            System.out.println("Book Not Found!");
        } else if (!available[index]) {
            System.out.println("Book is Already Issued!");
        } else {
            available[index] = false;
            System.out.println("Book Issued Successfully!");
        }
    }

    // Return Book
    static void returnBook() {

        System.out.println("Enter Book ID to Return:");
        int id = sc.nextInt();

        int index = findBook(id);

        if (index == -1) {
            System.out.println("Book Not Found!");
        } else if (available[index]) {
            System.out.println("Book is Already Available!");
        } else {
            available[index] = true;
            System.out.println("Book Returned Successfully!");
        }
    }

    // Delete Book
    static void deleteBook() {

        System.out.println("Enter Book ID to Delete:");
        int id = sc.nextInt();

        int index = findBook(id);

        if (index == -1) {
            System.out.println("Book Not Found!");
            return;
        }

        for (int i = index; i < count - 1; i++) {

            bookIds[i] = bookIds[i + 1];
            bookNames[i] = bookNames[i + 1];
            authors[i] = authors[i + 1];
            prices[i] = prices[i + 1];
            available[i] = available[i + 1];
        }

        count--;

        System.out.println("Book Deleted Successfully!");
    }

    // Find Book Index
    static int findBook(int id) {

        for (int i = 0; i < count; i++) {

            if (bookIds[i] == id) {
                return i;
            }
        }

        return -1;
    }
}

