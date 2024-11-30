from Shape import Shape

# Concrete Elements
class Circle(Shape):
    def accept(self, visitor):
        visitor.visit_circle(self)