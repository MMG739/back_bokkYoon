package data.repositories;

import data.entities.Ride;
import data.entities.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Ride,Long> {
}
