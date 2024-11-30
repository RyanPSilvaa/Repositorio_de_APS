package edu.uea;

class VIPCustomerDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.80; // 20% de desconto
    }
}

