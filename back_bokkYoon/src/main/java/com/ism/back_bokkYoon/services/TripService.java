package com.ism.back_bokkYoon.services;

import data.entities.Trip;

import java.util.List;

public interface TripService {
    void saveTrip(Trip trip);
    List<Trip> getAllTrips();

}
