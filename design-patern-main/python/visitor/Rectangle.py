from Shape import Shape

class Rectangle(Shape):
    def accept(self, visitor):
        visitor.visit_rectangle(self)