package technicalassessment.discount;
import org.springframework.stereotype.Service;
import technicalassessment.models.Bill;
import technicalassessment.models.Item;
import technicalassessment.models.User;

import java.math.BigDecimal;

@Service
public class Discount implements CalculateDiscount {

    @Override
    public BigDecimal discountCalculation(User user, Bill bill) {
        ApplyDiscount helper = new ApplyDiscount();

        BigDecimal totalAmount = helper.calculateTotal(bill.getItems());
        BigDecimal groceryAmount = helper.calculateTotalPerType(bill.getItems(), Item.ItemType.GROCERY);
        BigDecimal nonGroceryAmount = totalAmount.subtract(groceryAmount);
        BigDecimal userDiscount = helper.getUserDiscount(user);
        BigDecimal billsDiscount = helper.calculateBillsDiscount(totalAmount, new BigDecimal(100), new BigDecimal(5));
        if (nonGroceryAmount.compareTo(BigDecimal.ZERO) > 0) {
            nonGroceryAmount = helper.calculateDiscount(nonGroceryAmount, userDiscount);
        }

        BigDecimal finalAmount = (groceryAmount.add(nonGroceryAmount).subtract(billsDiscount));
        return finalAmount;
    }
}
