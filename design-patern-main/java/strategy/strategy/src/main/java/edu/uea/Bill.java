package edu.uea;

// Contexto
class Bill {
    private DiscountStrategy discountStrategy;

    public Bill(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateFinalAmount(double amount) {
        return discountStrategy.applyDiscount(amount);
    }
}
