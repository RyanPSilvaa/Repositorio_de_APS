from Beverage import Beverage

# Decorador abstrato
class BeverageDecorator(Beverage):
    def __init__(self, beverage):
        self.beverage = beverage

    def get_description(self):
        return self.beverage.get_description()

    def cost(self):
        return self.beverage.cost()
