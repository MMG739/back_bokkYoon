package data.fixtures;

import data.entities.Ride;
import data.entities.Users;
import data.repositories.RideRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class RideFixture implements CommandLineRunner {
    private final RideRepository rideRepository;

    public RideFixture(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Ride ride1 = new Ride("modou","okkkk",10,2,1000);
        rideRepository.save(ride1);
        Ride ride2 = new Ride("modou","OKKKK",15,5,2500);
        rideRepository.save(ride2);
        Ride ride3 = new Ride("modou","OKKKKKK",20,3,4000);
        rideRepository.save(ride3);


    }
}
