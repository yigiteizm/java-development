package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder billingAddress = new StringBuilder();

        System.out.print("Name: ");
        billingAddress.append( scanner.nextLine()).append("\n");
        System.out.print("Street: ");
        billingAddress.append(scanner.nextLine()).append("\n");

        System.out.print("City: ");
        billingAddress.append(scanner.nextLine()).append("\n");

        System.out.print("State: ");
        billingAddress.append(scanner.nextLine()).append("\n");

        System.out.print("Zip Code: ");
        billingAddress.append(scanner.nextLine()).append("\n");


        System.out.println("\nEnter your shipping address:");
        StringBuilder shippingAddress = new StringBuilder();


        System.out.print("Street: ");
        shippingAddress.append(scanner.nextLine()).append("\n");

        System.out.print("City: ");
        shippingAddress.append(scanner.nextLine()).append("\n");

        System.out.print("State: ");
        shippingAddress.append(scanner.nextLine()).append("\n");

        System.out.print("Zip Code: ");
        shippingAddress.append(scanner.nextLine()).append("\n");

        System.out.println("\nBilling Address:");
        System.out.println(billingAddress.toString());

        System.out.println("Shipping Address:");
        System.out.println(shippingAddress.toString());
    }
}
