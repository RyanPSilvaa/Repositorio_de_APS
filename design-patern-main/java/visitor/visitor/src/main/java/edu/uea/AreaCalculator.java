package edu.uea;

// Concrete Visitor
class AreaCalculator implements Visitor {
    @Override
    public void visitCircle(Circle circle) {
        System.out.println("Calculating area of a Circle.");
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.println("Calculating area of a Rectangle.");
    }
}
