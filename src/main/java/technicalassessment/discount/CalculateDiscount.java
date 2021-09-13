package technicalassessment.discount;
import technicalassessment.models.Bill;
import technicalassessment.models.User;

import java.math.BigDecimal;

public interface CalculateDiscount {

    BigDecimal discountCalculation(User user, Bill bill);
}