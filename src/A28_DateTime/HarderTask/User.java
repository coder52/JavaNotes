package A28_DateTime.HarderTask;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
    String name;
    LocalDateTime registration;

    public User(String name) {
        this.name = name;
        this.registration = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "User :" + name +  ", registration=" + registration;
    }
}
