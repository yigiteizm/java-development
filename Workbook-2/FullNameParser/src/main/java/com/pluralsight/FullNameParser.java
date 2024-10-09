package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String fullName = scanner.next().trim();
        String[] nameSplit = fullName.split(//" ");
        if (nameSplit.length == 2 ){
            firstname = nameSplit[0];
            lastname =  nameSplit[1];
        } else if (nameSplit.length == 3) {
            firstname
                    middlename
                    lastname

        }
        System.out.println(fullName);








    }
}
