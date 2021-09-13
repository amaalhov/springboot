package technicalassessment.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Item {

    public enum ItemType {
        GROCERY,
        CLOTHES,
        TECHNOLOGY,
        OTHER
    }


    private ItemType type;

    private BigDecimal price;
}
