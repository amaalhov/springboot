package technicalassessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import technicalassessment.discount.CalculateDiscount;

//import javax.validation.Valid;
import java.math.BigDecimal;

@RestController
@RequestMapping("getNetPrice")
public class Controller {

    @Autowired
    private CalculateDiscount calculateDiscount;

    @PostMapping
    public BigDecimal createDiscount(@RequestBody getBill request) {
        return calculateDiscount.discountCalculation(request.getUser(), request.getBill());
    }

}
