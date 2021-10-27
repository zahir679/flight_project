package com.planeApp.flight;

public class Flights {
    private int flightNumber;
    private AllFlights allFlights;
    private String origin;
    private String destination;

    public Flights(int flightNumber, String origin, String destination) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
    }

    public AllFlights getAllFlights() {
        return allFlights;
    }

    public void setAllFlights(AllFlights allFlights) {
        this.allFlights = allFlights;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        String one = "Flight " + flightNumber;
        String two = ", " + "from " + origin + " to " + destination;
        return one + two;
    }
}



