from DiscountStrategy import DiscountStrategy

# Implementações concretas
class RegularCustomerDiscount(DiscountStrategy):
    def apply_discount(self, amount):
        return amount * 0.90  # 10% de desconto