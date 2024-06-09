package data.fixtures;

import data.entities.Trip;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Locale;
@RequiredArgsConstructor
@Component
public class TripFixture implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH);


        Trip trip1 = new Trip("voyage", formatter.parse("01/06/2024"), 5L, "arrivé","Vert");
        Trip trip2 = new Trip("tourisme", formatter.parse("20/06/2024"), 10L, "à venir","Orange");
        Trip trip3 = new Trip("ecole", formatter.parse("10/06/2024"), 7L, "expiré","Rouge");

    }
}
