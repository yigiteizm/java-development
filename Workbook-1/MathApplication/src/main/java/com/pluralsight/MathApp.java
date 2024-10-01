package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        double bobSalary = 5980;
        double garySalary = 6210;
        double highSalary = Math.max(bobSalary, garySalary);

        System.out.println("Highest Salary : " + highSalary);

        double Carprice = 32150;
        double Truckprice = 46750;
        double CheaperPrice =Math.min(Carprice, Truckprice);

        System.out.println("Cheapest Vehicle: " + CheaperPrice);

        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Result: " + area);


        double distance = 5.0;
        double squareroot = Math.sqrt(distance);
        System.out.println("Result: " + squareroot);

        int x1=5 , y1=10 , x2=85 , y2=50;
        double Distance =Math.sqrt(Math.pow(x2-x1 , 2) + Math.pow(y2 - y1, 2));
        System.out.println(Distance);


        double Negative = -3.8;
        double absolute =Math.abs(Negative);
        System.out.println("Absolute Result: " + absolute);

        double random =Math.random();
        System.out.println("Result: " + random);










    }
}
