from BeverageDecorator import BeverageDecorator

class SugarDecorator(BeverageDecorator):
    def get_description(self):
        return self.beverage.get_description() + ", Sugar"

    def cost(self):
        return self.beverage.cost() + 0.5