from BeverageDecorator import BeverageDecorator

# Decoradores concretos
class MilkDecorator(BeverageDecorator):
    def get_description(self):
        return self.beverage.get_description() + ", Milk"

    def cost(self):
        return self.beverage.cost() + 1.5