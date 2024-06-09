package data.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, length = 50)
    private  String title;
    @Column(nullable = false, length = 20)
    private Date date;
    @Column(nullable = false)
    private  Long  passengers;
    @Column(nullable = false, length = 50)
    private  String status;
    @Column(nullable = false, length = 50)
    private String color;

    @ManyToMany(mappedBy = "Trips", fetch = FetchType.LAZY)
    private List<Users> Users;
    @ManyToOne
    private Ride ride;

    public Trip(String title, Date date, Long passengers, String status, String color) {
        this.title = title;
        this.date = date;
        this.passengers = passengers;
        this.status = status;
        this.color = color;
    }


}
