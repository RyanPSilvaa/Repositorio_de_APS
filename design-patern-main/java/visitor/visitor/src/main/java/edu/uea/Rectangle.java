package edu.uea;

class Rectangle implements Shape {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitRectangle(this);
    }
}