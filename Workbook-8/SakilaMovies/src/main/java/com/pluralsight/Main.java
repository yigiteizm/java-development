package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class DataSourceConfig {
    private static final BasicDataSource dataSource = new BasicDataSource();

    static {
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername("root"); //
        dataSource.setPassword("p@ssw0rd");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setInitialSize(5);
        dataSource.setMaxTotal(10);
    }

    public static DataSource getDataSource() {
        return dataSource;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the last name of an actor: ");
        String lastName = scanner.nextLine();

        displayActorsByLastName(lastName);

        System.out.print("Enter the first name of the actor: ");
        String firstName = scanner.nextLine();

        displayMoviesByActor(firstName, lastName);
    }

    private static void displayActorsByLastName(String lastName) {
        String query = "SELECT actor_id, first_name, last_name FROM actor WHERE last_name = ?";

        try (Connection connection = DataSourceConfig.getDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, lastName);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (!resultSet.isBeforeFirst()) {
                    System.out.println("No actors found with last name: " + lastName);
                    return;
                }

                System.out.println("Actors with last name '" + lastName + "':");
                while (resultSet.next()) {
                    int actorId = resultSet.getInt("actor_id");
                    String firstName = resultSet.getString("first_name");
                    System.out.println(actorId + ": " + firstName + " " + lastName);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void displayMoviesByActor(String firstName, String lastName) {
        String query = "SELECT film.title " +
                "FROM film " +
                "JOIN film_actor ON film.film_id = film_actor.film_id " +
                "JOIN actor ON film_actor.actor_id = actor.actor_id " +
                "WHERE actor.first_name = ? AND actor.last_name = ?";

        try (Connection connection = DataSourceConfig.getDataSource().getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, firstName);
            statement.setString(2, lastName);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (!resultSet.isBeforeFirst()) {
                    System.out.println("No movies found for actor: " + firstName + " " + lastName);
                    return;
                }

                System.out.println("Movies featuring " + firstName + " " + lastName + ":");
                while (resultSet.next()) {
                    String movieTitle = resultSet.getString("title");
                    System.out.println("- " + movieTitle);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
