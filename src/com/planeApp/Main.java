package com.planeApp;

import com.planeApp.flight.FlightsService;
import com.planeApp.person.Nationality;
import com.planeApp.person.Passport;
import com.planeApp.person.UserService;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        UserService userService = new UserService();

        FlightsService flightsService = new FlightsService();

        //1. Register
        //2. Book Flight
        //3. Display all flight
        //4. Display booked flights
        //5. Cancel Flights (not yet done)
        
        Scanner input = new Scanner(System.in);
        
        boolean flag = false;
        while (!flag) { // whilst flag is false run code but break out of loop if true
            System.out.println("");
            System.out.println("Option 1: Register for a flight booking");
            System.out.println("Option 2: Book a flight");
            System.out.println("Option 3: Display all currently available flights");
            System.out.println("Option 4: Display your booked flights");
            System.out.println("Option 0: Exit");
            System.out.println("Please enter 1, 2, 3, 4 to continue or 0 to exit");
            String option = input.nextLine();
            switch (option) {
                case "1":
                    userService.makeUser();
                    System.out.println("Thank you for registering, your details are now saved.");
                    File file = new File("UserBooking.txt");
                    Scanner scan = new Scanner(file);
                    while (scan.hasNextLine()) {
                        System.out.println(scan.nextLine());
                    }
                    Scanner scanner0 = new Scanner(System.in);
                    System.out.println("What is your UUID?");
                    String id = scanner0.nextLine();
                    try {
                        FileWriter fw = new FileWriter("FlightBooking.txt", true);
                        PrintWriter pw = new PrintWriter(fw);
                        pw.print( id + "\n");
                        pw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "2":
                    flightsService.addNewFlight();
                    System.out.println("Your flights have now been booked!!!");
                    break;
                case "3":
                    flightsService.displayAllFlights();
                    break;
                case "4":
                    flightsService.displayBookedFlights();
                    break;
                case "5":
                    break;
                case "0":
                    flag = true;
                    break;
                default:
                    System.out.println("You entered an invalid option");
            }
        }
    }
}



