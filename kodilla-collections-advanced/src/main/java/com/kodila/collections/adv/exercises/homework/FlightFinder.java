package com.kodila.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure){
        List<Flight> flightsTable = FlightRepository.getFlightsTable();
        List<Flight> flightsFrom = new ArrayList<>();

        for (Flight flight: flightsTable) {
            if (flight.getDeparture().equals(departure)){
                flightsFrom.add(flight);
            }else{
                flightsFrom = Collections.emptyList();
                }
            }
        return flightsFrom;
    }

    public List<Flight> findFlightsTo(String arrival){
        List<Flight> flightsTable = FlightRepository.getFlightsTable();
        List<Flight> flightsTo = new ArrayList<>();

        for (Flight flight: flightsTable) {
            if (flight.getDeparture().equals(arrival)){
                flightsTo.add(flight);
            }else{
                flightsTo = Collections.emptyList();
            }
        }
        return flightsTo;

    }


}
