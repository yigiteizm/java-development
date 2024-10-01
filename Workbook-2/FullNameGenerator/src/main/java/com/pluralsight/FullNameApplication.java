package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Enter your middle name: ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Enter your suffix: ");
        String suffix = scanner.nextLine().trim();

        String fullName = firstName;

        if(!middleName.isEmpty()) {
            fullName = fullName + " " + middleName.charAt(0) + ".";
        }
        fullName = fullName + " " + lastName;
        if(!suffix.isEmpty()) {
            fullName = fullName + ", " + suffix;
        }
        System.out.println("Full name:" + fullName);
        scanner.close();

    }


}
