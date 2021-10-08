package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // create a LocalDate object
        System.out.println("Enter the day you were born");
        int day = input.nextInt();
        System.out.println("Enter the month you were born");
        int month = input.nextInt();
        System.out.println("Enter the year you were born");
        int year = input.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
                //= LocalDate.parse(input.next());
                //= LocalDate.input.nextInt();
        System.out.println("your birthday is  "+date);
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate subbed = date;
        subbed= now.minusYears(year);
        subbed= now.minusMonths(month);
        subbed= now.minusDays(day);
        System.out.println(subbed);
        // print instance
        /*
        System.out.println("LocalDate before"
                + " subtracting days: " + date);

        // subtract 17 days
        LocalDate returnvalue
                = date.minusDays(17);

        // print result
        System.out.println("LocalDate after "
                + " subtracting days: " + returnvalue);

        // Converting LocalDate to String
        // Example 1
        *\
         */
        /*
        LocalDate d1 = LocalDate.now();
        String d1Str = d1.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date1 in string :  " + d1Str);
        // Example 2
        LocalDate d2 = LocalDate.of(2002, 05, 01);
        String d2Str = d2.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date2 in string :  " + d2Str);
        // Example 3
        LocalDate d3 = LocalDate.of(2016, 11, 01);
        String d3Str = d3.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date3 in string :  " + d3Str);
        System.out.println(d1Str);

         */
    }
}
