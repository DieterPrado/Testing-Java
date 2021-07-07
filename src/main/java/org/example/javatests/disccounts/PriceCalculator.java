package org.example.javatests.disccounts;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PriceCalculator {
    private ArrayList<Double> prices = new ArrayList<>();
    private double discount;

    public double getTotal() {
        double result = 0;
        for (Double each:prices) {
            result += each;
        }
        return result - (result * discount / 100);
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
