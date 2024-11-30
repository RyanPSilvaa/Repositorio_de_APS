package edu.uea;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription() + " $" + coffee.cost());

        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription() + " $" + coffee.cost());
    }
}