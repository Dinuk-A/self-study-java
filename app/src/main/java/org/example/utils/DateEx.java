package org.example.utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateEx {

    //1 basics
    public static void basicOps() {
        
        //display current date
        LocalDate today = LocalDate.now();
        System.out.println("date today "+ today);

        //display current time
        System.out.println(LocalTime.now() + " is time now");

        //all in one
        System.out.println("all in one " + LocalDateTime.now());
    }

    //2 format
    public static void formatVals() {

        LocalDateTime current = LocalDateTime.now();
        System.out.println("before formatting " + current);

        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-YYYY hh:mm:ss");

        String formattedValue = current.format(myFormat);
        System.out.println("after formatting "+ formattedValue);

    }


}
