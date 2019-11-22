package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportMap = new HashMap<>();
        airportMap.put("LAX", true);
        airportMap.put("JFK", true);
        airportMap.put("WAW", false);

        String arrivalAirport = flight.getArrivalAirport();
        String departureAirport = flight.getDepartureAirport();

        boolean mapContainsArrivalAirport = airportMap.containsKey(arrivalAirport);
        boolean mapContainsDepartureAirport = airportMap.containsKey(departureAirport);

        if (mapContainsArrivalAirport && mapContainsDepartureAirport) {
            return airportMap.get(arrivalAirport) && airportMap.get(departureAirport);
        } else {
            String message;

            if (!mapContainsArrivalAirport && !mapContainsDepartureAirport) {
                message = "there is no airport in " + departureAirport + "and in " + arrivalAirport;
            } else if (!mapContainsArrivalAirport) {
                message = "there is no airport in " + arrivalAirport;
            } else {
                message = "there is no airport in " + departureAirport;
            }

            throw new RouteNotFoundException(message);
        }
    }

    public static void main(String[]args){
        Flight flight1 = new Flight("JFK", "Sosnowiec");

        FlightSearch flightSearch =new FlightSearch();

        try {
            System.out.println("JFK - Sosnowiec");
            System.out.println(flightSearch.findFlight(flight1));
        }catch (RouteNotFoundException e){
            System.out.println(e.getMessage());

        }finally{
            System.out.println("Thank you for using our FlightSearcher!");
        }
    }
}
