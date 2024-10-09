package com.pluralsight;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();


        int firstSpaceIndex = fullName.indexOf(' ');


        String firstName = fullName.substring(0, firstSpaceIndex);
        String lastName = fullName.substring(firstSpaceIndex + 1).trim();


        System.out.print("Enter the date of the show ( MM/dd/yyyy): ");
        String showDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");


        System.out.print("Enter the number of tickets: ");
        int numberOfTickets = scanner.nextInt();


        if (numberOfTickets == 1) {
            String confirmationMessage = "#" + numberOfTickets + " ticket reserved for " + showDate +
                    " under (" + lastName + ", " + firstName + ")";
            System.out.println(confirmationMessage);
        } else {
            String confirmationMessage = "#" + numberOfTickets + " tickets reserved for " + showDate +
                    " under " + lastName + ", " + firstName + "";
            System.out.println(confirmationMessage);
        }




        scanner.close();
    }
}
