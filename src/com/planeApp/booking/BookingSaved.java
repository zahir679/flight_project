package com.planeApp.booking;

import com.planeApp.person.User;
import com.planeApp.person.UserService;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookingSaved {
//        private static String id = UUID.randomUUID().toString();


    //    List<User> user = new ArrayList<>();
    public static void userDetails(String name, String email, String phoneNumber, int passport, String id) throws IOException {
        FileWriter myWriter = new FileWriter("UserBooking.txt", true);
        myWriter.write("Name: " + name);
        myWriter.write(System.getProperty("line.separator"));
        myWriter.write("Email: " + email);
        myWriter.write(System.getProperty("line.separator"));
        myWriter.write("Mobile Number: " + phoneNumber);
        myWriter.write(System.getProperty("line.separator"));
        myWriter.write("Passport Number: " + passport);
        myWriter.write("\n");
        myWriter.write("Unique ID: " + id);
        myWriter.write("\n");
        myWriter.write("\n");
        myWriter.close();

    }
    public static void flightDetails(int flightNumber, String origin, String destination) throws IOException {
        UserService userService = new UserService();
        FileWriter myWriter = new FileWriter("FlightBooking.txt", true);
        myWriter.write("Flight Number: " + flightNumber);
        myWriter.write(System.getProperty("line.separator"));
        myWriter.write("Origin of Flight: " + origin);
        myWriter.write(System.getProperty("line.separator"));
        myWriter.write("Destination: " + destination);
        myWriter.write(System.getProperty("line.separator"));
        myWriter.write("Booking Reference: Provided at the top"); ;
        myWriter.write("\n");
        myWriter.write("\n");
        myWriter.close();
    }
}
