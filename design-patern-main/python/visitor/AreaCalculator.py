from Visitor import Visitor

class AreaCalculator(Visitor):
    def visit_circle(self, circle):
        print("Calculating area of a Circle.")

    def visit_rectangle(self, rectangle):
        print("Calculating area of a Rectangle.")