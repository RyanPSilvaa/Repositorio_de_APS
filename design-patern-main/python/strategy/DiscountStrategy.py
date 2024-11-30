from abc import ABC, abstractmethod

# Interface Strategy
class DiscountStrategy(ABC):
    @abstractmethod
    def apply_discount(self, amount):
        pass