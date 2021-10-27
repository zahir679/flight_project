package com.planeApp.flight;

import com.planeApp.booking.BookingSaved;

import java.io.IOException;
import java.util.*;

public class FlightsService {

    List<Flights> flights = new ArrayList<>();
    List<Flights> fullBookedFlights = new ArrayList<>();


    public void addNewFlight() throws IOException {
        int flightNumber;
        String origin;
        String destination;

        // generate random flight number
        Random rand = new Random();
        int upperbound = 999;
        flightNumber = rand.nextInt(upperbound);

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the flight origin:");
        origin = scan2.nextLine();

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Enter the flight destination:");
        destination = scan3.nextLine();

        Flights f = new Flights(flightNumber, origin, destination);
        flights.add(f); // adding flight details as an array into flights array list

        BookingSaved.flightDetails(flightNumber, origin, destination);
    }

//    public void addFullBookedFlight() {
//        int flightNumber;
//        String origin;
//        String destination;
//
//        Scanner scan1 = new Scanner(System.in);
//        System.out.println("Enter the flight number:");
//        flightNumber = scan1.nextInt();
//
//        Scanner scan2 = new Scanner(System.in);
//        System.out.println("Enter the flight origin:");
//        origin = scan2.nextLine();
//
//        Scanner scan3 = new Scanner(System.in);
//        System.out.println("Enter the flight destination");
//        destination = scan3.nextLine();
//
//        Flights F = new Flights(flightNumber, origin, destination);
//        fullBookedFlights.add(F); // adding flight details as an array into flights array list
//    }


    public void displayAllFlights() {
        AllFlights allFlights[] = AllFlights.values();
        for (AllFlights allFlight : allFlights) {
            System.out.println(allFlight);
        }
//        int numFlights = flights.size();
//        if (numFlights == 0) {
//            System.out.println("There are no flights available at the moment! Sorry");
//        }

//        for (Flights flight : flights) {
//            System.out.println(flight.toString());
//        }
    }

    public void displayBookedFlights() {
        int numBookedFlights = flights.size();
        if (numBookedFlights == 0) {
            System.out.println("You have not booked any flights at the moment!");
        }
        for (Flights flight : flights) {
            String from = flight.getOrigin();
            String to = flight.getDestination();
            System.out.println("Your have a flight booking from " + from + " to " + to);
        }
    }

//    public void cancelFlight() {
//        String origin;
//        String destination;
//        System.out.println("To cancel the flight please enter the origin and destination of your flight.");
//        Scanner scan2 = new Scanner(System.in);
//        System.out.println("Enter the flight origin:");
//        origin = scan2.nextLine();
//
//        Scanner scan3 = new Scanner(System.in);
//        System.out.println("Enter the flight destination:");
//        destination = scan3.nextLine();
//        // no flights booked yet until a user books with his id
//        Flights P = new Flights(flightNumber, origin, destination);
//    }


}


