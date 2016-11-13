package com.domain;

/**
 * Created by Michał on 2016-11-12.
 */
public final class PassengerBuilder {
    private String firstName;
    private String lastName;

    private PassengerBuilder() {
    }

    public static PassengerBuilder aPassenger() {
        return new PassengerBuilder();
    }

    public PassengerBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PassengerBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Passenger build() {
        Passenger passenger = new Passenger();
        passenger.setFirstName(firstName);
        passenger.setLastName(lastName);
        return passenger;
    }
}