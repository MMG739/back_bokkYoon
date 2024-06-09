package data.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, length = 50)
    private  String driverName;
    @Column(nullable = false, length = 200)
    private  String driverImage;
    @Column(nullable = false)
    private  double distance;
    @Column(nullable = false)
    private  double rating;
    @Column(nullable = false)
    private  double tarif;
    @OneToMany(mappedBy = "ride")
    private List<Trip> trips;

    public Ride(String driverName, String driverImage, double distance, double rating, double tarif) {
        this.driverName = driverName;
        this.driverImage = driverImage;
        this.distance = distance;
        this.rating = rating;
        this.tarif = tarif;
    }
}
