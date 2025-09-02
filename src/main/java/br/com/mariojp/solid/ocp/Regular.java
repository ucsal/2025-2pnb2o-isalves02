package br.com.mariojp.solid.ocp;

public class Regular extends DiscountCalculator {
    private double amount;

    public Regular (double amount) {
        this.amount = amount;
    }

    public double calculateDiscount() {
        return this.amount * 0.90;
    } 
}