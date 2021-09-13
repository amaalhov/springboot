package technicalassessment.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bill {

    private List<Item> items;

}