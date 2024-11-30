from DiscountStrategy import DiscountStrategy

class VIPCustomerDiscount(DiscountStrategy):
    def apply_discount(self, amount):
        return amount * 0.80  # 20% de desconto