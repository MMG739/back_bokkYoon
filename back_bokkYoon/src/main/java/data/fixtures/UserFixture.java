package data.fixtures;

import data.entities.Trip;
import data.entities.Users;
import data.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@RequiredArgsConstructor
@Component
public class UserFixture implements CommandLineRunner {
    private final UsersRepository usersRepository;

    public UserFixture(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH);


        Trip trip1 = new Trip("voyage", formatter.parse("01/06/2024"), 5L, "arrivé","Vert");
        Trip trip2 = new Trip("tourisme", formatter.parse("20/06/2024"), 10L, "à venir","Orange");
        Trip trip3 = new Trip("ecole", formatter.parse("10/06/2024"), 7L, "expiré","Rouge");


        Users user1 = new Users("yannick", "yannick", "natolban",  "yannick@gmail.com", "passer123");
        usersRepository.save(user1);
        Users user2 = new Users("mamou", "mamou", "diop",  "mamou03@gmail.com", "passer123");
        usersRepository.save(user2);
        Users user3 = new Users("mariama", "mariama", "balarabe",  "mariama@gmail.com", "passer123");
        usersRepository.save(user3);
    }
}
