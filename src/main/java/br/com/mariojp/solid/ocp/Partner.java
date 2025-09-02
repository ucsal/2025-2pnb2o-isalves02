package br.com.mariojp.solid.ocp;

public class Partner extends DiscountCalculator {
    private double amount;

    public Partner (double amount) {
        this.amount = amount;
    }

    public double calculateDiscount() {
        return this.amount - (this.amount * 0.12);
    } 
}
