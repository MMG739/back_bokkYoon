package com.ism.back_bokkYoon.services.impl;

import com.ism.back_bokkYoon.services.TripService;
import data.entities.Trip;
import data.repositories.TripRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TripServiceImpl implements TripService {
    private TripRepository tripRepository;
    @Override
    public void saveTrip(Trip trip) {
        tripRepository.save(trip);

    }

    @Override
    public List<Trip> getAllTrips() {

        return tripRepository.findAll();
    }
}
