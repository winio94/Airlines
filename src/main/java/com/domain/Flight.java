package com.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Michał on 2016-10-02.
 */
@Entity
public class Flight {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String flightNumber;

    @NotNull
    private Date departureDate;

    @NotNull
    private Date arrivalDate;

    @NotNull
    private Double price;

    @Enumerated(EnumType.STRING)
    @NotNull
    private FLightClass fLightClass;

    @OneToOne
    @NotNull
    private Airport from;

    @OneToOne
    @NotNull
    private Airport to;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public FLightClass getfLightClass() {
        return fLightClass;
    }

    public void setfLightClass(FLightClass fLightClass) {
        this.fLightClass = fLightClass;
    }

    public Airport getFrom() {
        return from;
    }

    public void setFrom(Airport from) {
        this.from = from;
    }

    public Airport getTo() {
        return to;
    }

    public void setTo(Airport to) {
        this.to = to;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
