package edu.uea;

// Implementação concreta
class Coffee implements Beverage {
    public String getDescription() {
        return "Coffee";
    }

    public double cost() {
        return 5.0;
    }
}
