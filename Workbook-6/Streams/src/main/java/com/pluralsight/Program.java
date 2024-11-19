
package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> people = createPeopleList();

        System.out.print("Enter a name to search: ");
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();

        List<Person> matchingPeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(searchName) ||
                    person.getLastName().equalsIgnoreCase(searchName)) {
                matchingPeople.add(person);
            }
        }

        System.out.println("People with matching name:");
        for (Person person : matchingPeople) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

        double averageAge = calculateAverageAge(people);
        System.out.println("Average age: " + averageAge);

        int oldestAge = findOldestAge(people);
        System.out.println("Oldest person's age: " + oldestAge);

        int youngestAge = findYoungestAge(people);
        System.out.println("Youngest person's age: " + youngestAge);
    }

    private static List<Person> createPeopleList() {
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

        return people;
    }

    private static double calculateAverageAge(List<Person> people) {
        int totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }
        return (double) totalAge / people.size();
    }

    private static int findOldestAge(List<Person> people) {
        int maxAge = Integer.MIN_VALUE;
        for (Person person : people) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
            }
        }
        return maxAge;
    }

    private static int findYoungestAge(List<Person> people) {
        int minAge = Integer.MAX_VALUE;
        for (Person person : people) {
            if (person.getAge() < minAge) {
                minAge = person.getAge();
            }
        }
        return minAge;
    }
}




