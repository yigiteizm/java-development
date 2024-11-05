
package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();



        people.add(new Person("Raymond", "Maroun", 32));
        people.add(new Person("Dwayne", "Johnson", 30));
        people.add(new Person("Sofian", "Ambrabat", 45));
        people.add(new Person("Marcio", "Nobre", 22));
        people.add(new Person("Cristiano", "Ronaldo", 34));
        people.add(new Person("Lionel", "Messi", 29));
        people.add(new Person("James", "Rodriguez", 40));
        people.add(new Person("Jason", "Mamoa", 27));
        people.add(new Person("Rafa", "Silva", 33));
        people.add(new Person("Ciro", "Immobile", 28));




        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name that you want to search for: ");
        String searchName = scanner.nextLine();

        List<Person> matchWithPeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(searchName) || person.getLastName().equalsIgnoreCase(searchName)) {
                matchWithPeople.add(person);
            }
        }

        if (matchWithPeople.isEmpty()) {
            System.out.println("There is no any match.");
        } else {
            System.out.println("Matched people:");
            for (Person person : matchWithPeople) {
                System.out.println(person);

            }
        }



        int totalAge = 0;
        int maxAge = Integer.MIN_VALUE;
        int minAge = Integer.MAX_VALUE;

        for (Person person : people) {
            int age = person.getAge();
            totalAge += age;
            if (age > maxAge) {
                maxAge = age;
            }
            if (age < minAge) {
                minAge = age;
            }
        }

        double averageAge = (double) totalAge / people.size();
        System.out.println("Average age: " + averageAge);
        System.out.println("The oldest age: " + maxAge);
        System.out.println("The youngest age: " + minAge);
    }
}
