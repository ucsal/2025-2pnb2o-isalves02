package br.com.mariojp.solid.ocp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountCalculatorTest {
    @Test
    void partner_gets_12_percent() {
        double amount = 100.0;
        Partner partner = new Partner(amount);
        assertEquals(88.0, partner.calculateDiscount(), 0.0001,
            "PARTNER deveria ter 12% de desconto");
    }
}
