package org.example.javatests.disccounts;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class PriceCalculatorShould {
    @Test
    public void total_zero_when_there_are_no_prices(){
        PriceCalculator calculator = new PriceCalculator();
        assertThat(calculator.getTotal(), is(0.0));
    }

    @Test
    public void total_is_the_sum_of_prices(){
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(10.0);
        calculator.addPrice(15.0);
        calculator.addPrice(34.0);

        assertThat(calculator.getTotal(), is(59.0));
    }

    @Test
    public void apply_discount_to_prices(){
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(12.0);
        calculator.addPrice(16.0);
        calculator.addPrice(38.0);

        calculator.setDiscount(25);
        assertThat(calculator.getTotal(), is(49.5));
    }

}