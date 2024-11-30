package edu.uea;

// Concrete Elements
class Circle implements Shape {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}