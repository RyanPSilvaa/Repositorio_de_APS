from abc import ABC, abstractmethod

# Classe abstrata Forma
class Forma(ABC):
    @abstractmethod
    def desenhar(self):
        pass

# Implementações específicas das formas
class Circulo(Forma):
    def desenhar(self):
        return "Desenhando um círculo."

class Quadrado(Forma):
    def desenhar(self):
        return "Desenhando um quadrado."

class Retangulo(Forma):
    def desenhar(self):
        return "Desenhando um retângulo."

# Simple Factory
class FormaFactory:
    @staticmethod
    def criar_forma(tipo):
        if tipo == "circulo":
            return Circulo()
        elif tipo == "quadrado":
            return Quadrado()
        elif tipo == "retangulo":
            return Retangulo()
        else:
            raise ValueError("Tipo de forma desconhecido.")


# Uso do Factory Method
if __name__ == "__main__":
    # Uso do Simple Factory
    forma1 = FormaFactory.criar_forma("circulo")
    forma2 = FormaFactory.criar_forma("quadrado")
    forma3 = FormaFactory.criar_forma("retangulo")

    print(forma1.desenhar())  # Saída: Desenhando um círculo.
    print(forma2.desenhar())  # Saída: Desenhando um quadrado.
    print(forma3.desenhar())  # Saída: Desenhando um retângulo.
