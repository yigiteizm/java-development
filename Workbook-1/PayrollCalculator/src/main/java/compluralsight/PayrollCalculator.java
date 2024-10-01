package compluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {

        Scanner Hiscanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = Hiscanner.nextLine();

        System.out.print("Enter hours worked: ");
        double hoursWorked = Hiscanner.nextDouble();

        System.out.print("Enter pay rate: ");
        double payRate = Hiscanner.nextDouble();

        double grossPay = hoursWorked * payRate;
        System.out.println("Employee name : "  + name );
        System.out.println("Gross Pay :$"  + grossPay );

    }
}
