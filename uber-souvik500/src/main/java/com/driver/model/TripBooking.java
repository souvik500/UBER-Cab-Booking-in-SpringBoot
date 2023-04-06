package com.driver.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TripBooking
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripBookingId;

    private String fromLocation;

    private String toLocation;

    private int distanceInKm;

    @Enumerated(EnumType.STRING)
    private TripStatus status;

    private int bill;

    // Child(TripBooking) with Parent(Customer [Many:1]
    @ManyToOne
    @JoinColumn
    Customer customer;


    //Child(TripBooking) to parent(Driver) [Many:1]
    @ManyToOne
    @JoinColumn
    Driver driver;
}