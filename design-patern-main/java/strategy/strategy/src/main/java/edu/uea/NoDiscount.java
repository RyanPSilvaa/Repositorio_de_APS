package edu.uea;

class NoDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount; // Sem desconto
    }
}
