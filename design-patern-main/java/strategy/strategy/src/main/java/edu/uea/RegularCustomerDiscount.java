package edu.uea;

// Implementações concretas
class RegularCustomerDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.90; // 10% de desconto
    }
}