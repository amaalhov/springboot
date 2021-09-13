package technicalassessment.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {

    public enum UserType {
        EMPLOYEE, AFFILIATE, CUSTOMER
    }

    private UserType type;

    private LocalDate registerDate;
}