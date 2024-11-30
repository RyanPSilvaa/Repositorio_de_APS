from DiscountStrategy import DiscountStrategy

class NoDiscount(DiscountStrategy):
    def apply_discount(self, amount):
        return amount  # Sem desconto