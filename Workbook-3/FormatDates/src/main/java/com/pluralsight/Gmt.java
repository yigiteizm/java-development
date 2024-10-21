package com.pluralsight;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Gmt {
    public static void main(String[] args) {
        LocalDateTime localdateTime = LocalDateTime.now();



        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println("Type 1 on Local Machine: " + localdateTime.format(formatter1));


        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Type 2 on Local Machine : " + localdateTime.format(formatter2));


        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        System.out.println("Type 3 on Local Machine: " + localdateTime.format(formatter3));

        System.out.println("==========================================================");

        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime gmtDateTime = ZonedDateTime.now(ZoneId.of("GMT"));
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy, HH");
        System.out.println("Gmt Date and Time: " + gmtDateTime.format(formatter4));



    }









}
