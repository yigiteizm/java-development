package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Room room = new Room(2, 100.00);


        room.checkIn();
        System.out.println("Room is occupied: " + room.isOccupied());
        System.out.println("Room is dirty: " + room.isDirty());


        room.checkout();
        System.out.println("Room is occupied: " + room.isOccupied());
        room.cleanRoom();
        System.out.println("Room is dirty: " + room.isDirty());


        Employee employee = new Employee(1, "Yigit", "Manager", 35.00);
        employee.punchIn(9.0);


        employee.punchOut(17.5);
        System.out.println("Hours worked: " + employee.getHoursWorked());
        System.out.println("Total pay: " + employee.getTotalPay());
        System.out.println("Regular hours: " + employee.getRegularHours());
        System.out.println("Overtime hours: " + employee.getOvertimeHours());


        employee.punchTimeCard(9.0);
        employee.punchTimeCard(18.0);
        System.out.println("Hours worked: " + employee.getHoursWorked());
        System.out.println("Total pay: " + employee.getTotalPay());
        System.out.println("Regular hours: " + employee.getRegularHours());
        System.out.println("Overtime hours: " + employee.getOvertimeHours());
    }
}