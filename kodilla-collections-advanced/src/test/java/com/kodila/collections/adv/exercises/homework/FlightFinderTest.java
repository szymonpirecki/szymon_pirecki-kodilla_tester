package com.kodila.collections.adv.exercises.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FlightFinderTest {


@Test
    void shouldReturnFlightFromOslo(){
    List<Flight> flightList = FlightRepository.getFlightsTable();
    FlightFinder finder = new FlightFinder();

    flightList.add(new Flight("Oslo", "Amsterdam"));
    flightList.add(new Flight("Amsterdam", "Oslo"));
    flightList = finder.findFlightsFrom("Oslo");
    Object[] resultArray = flightList.toArray();

    List<Flight> expectedList = new ArrayList<>();
    expectedList.add(new Flight("Oslo","Amsterdam"));
    Object[] expectedArray = expectedList.toArray();

    Assertions.assertArrayEquals(expectedArray, resultArray);
}

@Test
    void shouldReturnFlightToAmsterdam(){
    List<Flight> flightList = FlightRepository.getFlightsTable();
    FlightFinder finder = new FlightFinder();

    flightList.add(new Flight("Oslo", "Amsterdam"));
    flightList.add(new Flight("Amsterdam", "Oslo"));
    flightList = finder.findFlightsTo("Amsterdam");
    Object[] resultArray = flightList.toArray();

    List<Flight> expectedList = new ArrayList<>();
    expectedList.add(new Flight("Oslo", "Amsterdam"));
    Object[] expectedArray = expectedList.toArray();

    Assertions.assertArrayEquals(expectedArray, resultArray);

}










}
