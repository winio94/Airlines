package com.domain;

/**
 * Created by Michał on 2016-10-23.
 */
public enum FlightClass {
    ECONOMY("Ekonomy"),
    PREMIUM_ECONOMY("Premium Economy"),
    BUSINESS_CLASS("Business class"),
    FIRST_CLASS("FIrst class");

    private String flightClass;

    FlightClass(String flightClass) {
        this.flightClass = flightClass;
    }
}