from abc import ABC, abstractmethod

# Produto abstrato
class Transporte(ABC):
    @abstractmethod
    def dirigir(self):
        pass

# Produtos concretos
class Carro(Transporte):
    def dirigir(self):
        return "Dirigindo um carro."

class Bicicleta(Transporte):
    def dirigir(self):
        return "Pedalando uma bicicleta."

# Fábrica
class TransporteFactory:
    @staticmethod
    def criar_transporte(tipo: str) -> Transporte:
        if tipo == "carro":
            return Carro()
        elif tipo == "bicicleta":
            return Bicicleta()
        else:
            raise ValueError("Tipo de transporte desconhecido.")

# Uso do Factory Method
if __name__ == "__main__":

    tipo_transporte = "bicicleta"  # Aqui você pode trocar por "bicicleta" para testar a outra opção
    transporte = TransporteFactory.criar_transporte(tipo_transporte)
    print(transporte.dirigir())

    tipo_transporte = "carro"  # Aqui você pode trocar por "bicicleta" para testar a outra opção
    transporte = TransporteFactory.criar_transporte(tipo_transporte)
    print(transporte.dirigir())


