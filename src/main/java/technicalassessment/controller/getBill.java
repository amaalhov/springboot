package technicalassessment.controller;

import lombok.Getter;
import lombok.Setter;
import technicalassessment.models.Bill;
import technicalassessment.models.User;

@Getter
@Setter
public class getBill {

    private User user;

    private Bill bill;
}
