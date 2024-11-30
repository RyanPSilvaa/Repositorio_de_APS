from Beverage import Beverage
from MilkDecorator import MilkDecorator
from SugarDecorator import SugarDecorator

# Testando o padrão Decorador
if __name__ == "__main__":
    coffee = Beverage()
    print(f"{coffee.get_description()} ${coffee.cost():.2f}")

    coffee = MilkDecorator(coffee)
    coffee = SugarDecorator(coffee)

    print(f"{coffee.get_description()} ${coffee.cost():.2f}")