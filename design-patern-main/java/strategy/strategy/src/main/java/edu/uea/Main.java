package edu.uea;

public class Main {
    public static void main(String[] args) {
        Bill bill = new Bill(new RegularCustomerDiscount());
        System.out.println("Regular customer: " + bill.calculateFinalAmount(100.0));

        bill.setDiscountStrategy(new VIPCustomerDiscount());
        System.out.println("VIP customer: " + bill.calculateFinalAmount(100.0));

        bill.setDiscountStrategy(new NoDiscount());
        System.out.println("No discount: " + bill.calculateFinalAmount(100.0));
    }
}