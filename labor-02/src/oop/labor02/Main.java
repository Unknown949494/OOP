package oop.labor02;

import java.util.Random;

public class Main {
    public static void main1(String[] args)
    {
        BankAccount account1 = new BankAccount("OTP00001");

        account1.deposit(1000);

        System.out.println("Bank Account Number: " + account1.getAccountNumber());
        System.out.println("Balance: " + account1.getBalance() + " EUR");

        boolean result = account1.withdraw(500);
        if (!result) {
            System.out.println("You do not have sufficient funds for this operation!");
        }

        System.out.println("\nBank Account Number: " + account1.getAccountNumber());
        System.out.println("Balance: " + account1.getBalance() + " EUR");
    }

    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[ 10 ];


        Random rand = new Random();
        for (int i = 0; i < rectangles.length; i++) {
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10);
            rectangles[i] = new Rectangle(length, width);
        }

        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Length: " + rectangles[i].getLength());
            System.out.println("Width: " + rectangles[i].getWidth());
            System.out.println("Perimeter: " + rectangles[i].perimeter());
            System.out.println("Area: " + rectangles[i].area());
            System.out.println();
        }

        double totalArea = 0;
        for (Rectangle rect : rectangles) {
            totalArea += rect.area();
        }
        System.out.println("Total area of all rectangles: " + totalArea);
    }

}

