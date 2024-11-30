from DiscountStrategy import DiscountStrategy


# Contexto
class Bill:
    def __init__(self, discount_strategy: DiscountStrategy):
        self.discount_strategy = discount_strategy

    def set_discount_strategy(self, discount_strategy: DiscountStrategy):
        self.discount_strategy = discount_strategy

    def calculate_final_amount(self, amount):
        return self.discount_strategy.apply_discount(amount)
