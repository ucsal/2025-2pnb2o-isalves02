package br.com.mariojp.solid.ocp;

public class Premium extends DiscountCalculator {
    private double amount;

    public Premium (double amount) {
        this.amount = amount;
    }

    public double calculateDiscount() {
        return this.amount - (this.amount * 0.95);
    } 
}